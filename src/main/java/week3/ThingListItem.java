package week3;

/*Aufgabe: LinkedList I

Schreibe eine Klasse AnimalListItem mit

einer Variable value vom Typ Animal
einer Variable next vom Typ AnimalListItem
einem Konstruktor mit value als Parameter

 */

import week3.Animal;


public class ThingListItem<T extends Object> {
    public ThingListItem(T valueX) {
//        this.value = value;
        this.valueX = valueX;
        next = null;
    }
//    week3.Animal value;
    ThingListItem next;
    public T valueX;

    public void add(T valueX)
    {
        if(next == null)
        {
            next = new ThingListItem(valueX);
        }
        else
            next.add(valueX);
    }
    public void remove(T valueX)
    {
        if(next == null)
        {
            return;
        }
        else if (next.valueX.equals( valueX ))
        {
            if(next.next != null)
                next = next.next;
            else
                next = null;
        }
        next.remove(valueX);
    }

}
