import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testName() {
        Student app = new Student();
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

    @Test
    public void testSemester() {
        Student app = new Student();
        app.setSemesterCount(0);
        app.setSemesterCount(1);
        assertTrue(app.getSemesterCount() == 1);
    }

    @Test
    public void testBirthdate() {
        Student app = new Student();
        Date testDate = new Date(1999, 12, 24);
        app.setBirthdate(null);
        app.setBirthdate(testDate);
        assertTrue(app.getBirthdate().equals(testDate));
    }

}