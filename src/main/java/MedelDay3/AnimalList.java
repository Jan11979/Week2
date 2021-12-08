package MedelDay3;

/*Aufgabe: LinkedList II

Schreibe entsprechende Tests!

 */
public class AnimalList {
    public AnimalListItem head;

    public void add(Animal value){
        if(value == null) {
            throw new IllegalArgumentException("Animal value cannot be null");
        }
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
        if(value == null) {
            throw new IllegalArgumentException("Animal value cannot be null");
        }
        if(head == null)
        {
            return;
        }
        else
        {
            if(head.value.equals(value))
            {
                if(head.next != null)
                    head = head.next;
                else
                    head = null;
            }
            else
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
