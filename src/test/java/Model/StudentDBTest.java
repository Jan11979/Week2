package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StudentDBTest {

    @Test
    public void testName() {
        //assertFalse(StudentDB.isStudentNameOK(null));
        // Wie Teste ich denn meine private Funktionen
    }

    @Test
    public void test_toString() {
        StudentDB.Student[] sList = new StudentDB.Student[3] ;
        sList[0] = new StudentDB.Student("Jan1","Mueller1");
        sList[1] = new StudentDB.Student("Jan2","Mueller2");
        sList[2] = new StudentDB.Student("Jan3","Mueller3");

        StudentDB studentDB = new StudentDB(sList);
        studentDB.toString();
        String string = studentDB.toString();
        assertTrue(string.equals("StudentDB{ ( Mueller1, Jan1) ( Mueller2, Jan2) ( Mueller3, Jan3)  }") );

    }
    @Test
    public void test_list() {
        StudentDB.Student[] sList = new StudentDB.Student[3] ;
        sList[0] = new StudentDB.Student("Jan1","Mueller1");
        sList[1] = new StudentDB.Student("Jan2","Mueller2");
        sList[2] = new StudentDB.Student("Jan3","Mueller3");

        StudentDB studentDB = new StudentDB(sList);
        StudentDB.Student[] NewList = studentDB.list();
        assertTrue(sList.length ==  NewList.length );
    }

    @Test
    public void test_AddRemoveStudent() {
        StudentDB.Student[] sList = new StudentDB.Student[3] ;
        sList[0] = new StudentDB.Student("Jan1","Mueller1");
        sList[1] = new StudentDB.Student("Jan2","Mueller2");
        sList[2] = new StudentDB.Student("Jan3","Mueller3");
        StudentDB studentDB = new StudentDB(sList);

        StudentDB.Student newStudent = new StudentDB.Student("Jan4","Mueller4");
        assertTrue(studentDB.addStudent(newStudent));

        // HAHA,     der User bekommt die ID garnnicht :)
        assertTrue(studentDB.removeStudent(2));
    }
}