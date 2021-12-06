import Model.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Calendar theUltimateBirthdate = new GregorianCalendar();


        Student tmpStudent = new Student();
        tmpStudent.setFirstName("Jan");
        tmpStudent.setLastName("Mueller");
        tmpStudent.setBirthdate(theUltimateBirthdate);
        System.out.println(tmpStudent.toString());

        Student tmpStudent2 = new Student();
        tmpStudent2.setFirstName("Jan");
        tmpStudent2.setLastName("Mueller");
        tmpStudent2.setBirthdate(theUltimateBirthdate);

        if (tmpStudent.equals(tmpStudent2)) {
            System.out.println("Equals = TRUE");
        }
        else
        {
            System.out.println("Equals = FALSE");
        }
        if (tmpStudent.equals(theUltimateBirthdate)) {
            System.out.println("Equals = TRUE");
        }


    }
}
