package MedelDay3;

/*Aufgabe: LinkedList II

Schreibe entsprechende Tests!

 */
public class AnimalList {
    public AnimalListItem head;

    public void add(Animal value){
        if(head == null)
        {
            head = new AnimalListItem(value);
        }
        else if(head.next == null)
        {
            head.next = new AnimalListItem(value);
        }
        else
            head.next.add(value);
    }

    public void remove(Animal value){
        if((head == null) || (value == null))
        {
            return;
        }
        else
        {
            head.remove(value);
        }
    }

    @Override
    public String toString() {
        String ret = "";
        if(head == null)
        {
            ret = "Empty";
        }
        else
        {
            AnimalListItem tmpItem = head;
            while( tmpItem != null )
            {
                ret += tmpItem.value.name;
                tmpItem = tmpItem.next;
                if(tmpItem != null )
                    ret += " -> ";
            }
        }

        return ret;
    }
}
