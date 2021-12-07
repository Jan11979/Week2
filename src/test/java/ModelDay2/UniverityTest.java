package ModelDay2;

import Model.StudentDB;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniverityTest {
    @Test
    public void test_it() {
        Univerity uni = new Univerity();

        uni.addStudent(new HistoryScienceStudent("Fanny"));
        assertTrue( uni.getStudentCount() == 1);
        uni.addStudent(new ComputerScienceStudent("Jonny"));
        assertTrue( uni.getStudentCount() == 2);
        assertTrue(uni.listStudents().contains("Fanny") );
        assertTrue(uni.listStudents().contains("Jonny") );
        uni.addStudent(new ComputerScienceStudent("Peter"));
        uni.addStudent(new ComputerScienceStudent("Peter"));
        assertTrue( uni.getStudentCount() == 4);
        assertTrue(uni.removeStudent(3) );
        assertFalse(uni.setStudentRepresentative(3) );
        assertTrue( uni.getStudentCount() == 3);
        assertFalse(uni.setStudentRepresentative(3) );
        assertTrue(uni.setStudentRepresentative(1) );

        Univerity uni2 = new Univerity();
        Student s1 = new HistoryScienceStudent("Fanny");
        s1.setValuation( 1.0 );
        Student s2 = new HistoryScienceStudent("Nanny");
        s2.setValuation( 0.5 );
        Student s3 = new HistoryScienceStudent("Banny");
        s3.setValuation( 0.5 );
        uni2.addStudent(s1);
        uni2.addStudent(s2);
        uni2.addStudent(s3);
        assertTrue(uni2.getBestStudent().getName().equals("Fanny") );
        assertTrue(uni2.getAverageGrade() == 0.6666666666666666 );
    }

}