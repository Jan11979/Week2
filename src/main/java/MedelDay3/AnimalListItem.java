package MedelDay3;

/*Aufgabe: LinkedList I

Schreibe eine Klasse AnimalListItem mit

einer Variable value vom Typ Animal
einer Variable next vom Typ AnimalListItem
einem Konstruktor mit value als Parameter


 */

public class AnimalListItem{
    public AnimalListItem(Animal value) {
        this.value = value;
        next = null;
    }
    Animal value;
    AnimalListItem next;
    public void add(Animal value)
    {
        if(next == null)
        {
            next = new AnimalListItem(value);
        }
        else
            next.add(value);
    }
    public void remove(Animal value)
    {
        if(next == null)
        {
            return;
        }
        else if (next.value == value)
        {
            if(next.next != null)
                next = next.next;
            else
                next = null;
        }
        else
            next.remove(value);
    }

}
