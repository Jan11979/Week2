package MedelDay3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalListTest {

    @Test
    public void test_Liste() {
        AnimalList aList = new AnimalList();

        Animal bobby = new Animal("C");
        aList.add(new Animal("A"));
        aList.add(new Animal("B"));
        aList.add(bobby);
        aList.add(new Animal("D"));
        aList.add(new Animal("E"));
        aList.add(bobby);
        aList.add(new Animal("F"));

        assertTrue(aList.toString().equals("A -> B -> C -> D -> E -> C -> F"));
        aList.remove(bobby);
        assertTrue(aList.toString().equals("A -> B -> D -> E -> F"));

        try {
            aList.add(null);
        } catch (Exception e) {
            assertTrue(true);
        }
        try {
            aList.remove(null);
        } catch (Exception e) {
            assertTrue(true);
        }

    }

}