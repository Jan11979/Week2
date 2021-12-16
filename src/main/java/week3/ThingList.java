package week3;

import MedelDay3.Animal;
import MedelDay3.AnimalListItem;

/*Aufgabe: LinkedList II

Schreibe entsprechende Tests!

 */
public class ThingList<T extends Object> {
    public ThingListItem head;

    public void add(T valueX){
        if(valueX == null) {
            throw new IllegalArgumentException("Animal value cannot be null");
        }
        if(head == null)
        {
            head = new ThingListItem(valueX);
        }
        else if(head.next == null)
        {
            head.next = new ThingListItem(valueX);
        }
        else
            head.next.add(valueX);
    }

    public void remove(T valueX){
        if(valueX == null) {
            throw new IllegalArgumentException("Animal value cannot be null");
        }
        if(head == null)
        {
            return;
        }
        else
        {
            if(head.valueX.equals(valueX))
            {
                if(head.next != null)
                    head = head.next;
                else
                    head = null;
            }
            else
                head.remove(valueX);
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
            ThingListItem tmpItem = head;
            while( tmpItem != null )
            {
                ret += tmpItem.valueX.toString();
                tmpItem = tmpItem.next;
                if(tmpItem != null )
                    ret += " -> ";
            }
        }

        return ret;
    }
}
