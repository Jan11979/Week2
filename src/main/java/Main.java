import Model.MyStudent;

import Model.StudentDB;
import Model.StudentDB.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    public static void main(String[] args) {

        Student[] sList = new Student[3] ;
        sList[0] = new StudentDB.Student("Jan1","Mueller1");
        sList[1] = new StudentDB.Student("Jan2","Mueller2");
        sList[2] = new StudentDB.Student("Jan3","Mueller3");

        StudentDB studentDB = new StudentDB(sList);
        Student[] NewList = studentDB.list();

        String alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);

        Student randStudent = studentDB.randomStudent();
        System.out.println("Random=" + randStudent.FirstName + ", " + randStudent.LastName );

        alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);
        studentDB.removeStudent(2);
        alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);
/*
        Calendar theUltimateBirthdate = new GregorianCalendar();


        MyStudent tmpStudent = new MyStudent();
        tmpStudent.setFirstName("Jan");
        tmpStudent.setLastName("Mueller");
//        tmpStudent.setBirthdate(theUltimateBirthdate);
        System.out.println(tmpStudent.toString());

        MyStudent tmpStudent2 = new MyStudent();
        tmpStudent2.setFirstName("Jan");
        tmpStudent2.setLastName("Mueller");
//        tmpStudent2.setBirthdate(theUltimateBirthdate);

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
*/
    }
}
