import Model.MyStudent;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testName() {
        MyStudent app = new MyStudent();
        app.setFirstName(null);
        app.setLastName(null);
        app.setFirstName("Jan");
        app.setLastName("Mueller");
        String FirstName = app.getFirstName();
        String LastName = app.getLastName();
        assertTrue(FirstName.equals("Jan"));
        assertTrue(LastName.equals("Mueller"));
        app.setName(null, null);
        app.setName("Peter", "Muster");
        FirstName = app.getFirstName();
        LastName = app.getLastName();
        assertTrue(FirstName.equals("Peter"));
        assertTrue(LastName.equals("Muster"));
    }


    /*
        @Test
        public void testBirthdate() {
            Student app = new Student();
            Calendar testDate = new GregorianCalendar();
            app.setBirthdate(null);
            app.setBirthdate(testDate);
            assertTrue(app.getBirthdate().equals(testDate));

            Calendar nowDate = new GregorianCalendar();
            //nowDate.setYear( nowDate.getYear()-10 );
            //app.setBirthdate(nowDate);
            //assertTrue(app.isBirthdayToday() == 10);
        }
    */
    @Test
    public void testEequals() {
        MyStudent std1 = new MyStudent();
        MyStudent std2 = new MyStudent();
        Calendar Date = new GregorianCalendar();
//        std1.setBirthdate(Date);
        std1.setFirstName("Jan");
        std1.setLastName("Mueller");
//      std2.setBirthdate(Date);
        std2.setFirstName("Jan");
        std2.setLastName("Mueller");
        assertTrue(std1.equals(std2));
//        std2.setBirthdate(Date);
        std2.setFirstName("Jani");
        std2.setLastName("Mueller");
        assertFalse(std1.equals(std2));
    }
}