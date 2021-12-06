package Model;

import java.util.*;

public class StudentDB {
    public static class Student {
        public String FirstName;
        public String LastName;

        public Student(String sFirst, String sLast) {
            this.FirstName = sFirst;
            this.LastName = sLast;
        }
    }

    private class StudentEntry {
        public String FirstName;
        public String LastName;
        public int iID;

        public StudentEntry(Student student, int iNewID) {
            this.FirstName = student.FirstName;
            this.LastName = student.LastName;
            this.iID = iNewID;
        }
    }

    List<StudentEntry> list = new ArrayList<StudentEntry>();
    int iLastID;

    public StudentDB() {
        iLastID = 0;
    }

    public StudentDB(Student[] arrStudent) {
        if (arrStudent == null)
            throw new IllegalArgumentException("arrStudent cannot be null");
        iLastID = 0;

        for (Student item : arrStudent) {
            this.addStudent(item);
            System.out.println(item);
        }
    }

    private boolean isStudentNameOK(Student student) {
        if (student != null)
            if (student.LastName != null)
                if (student.FirstName != null)
                    return true;
        return false;
    }

    public boolean addStudent(Student student) {
        if (isStudentNameOK(student) == false)
            return false;

        iLastID += 1;
        StudentEntry sEntry = new StudentEntry(student, iLastID);
        list.add(sEntry);
        return true;
    }
    public boolean removeStudent(int iStudentID) {
        for (StudentEntry lObject : list) {
            //cast needed
            StudentEntry tObject = (StudentEntry) lObject;
            if( tObject.iID == iStudentID )
            {
                list.remove( tObject );
                return true;
            }
        }
        return false;
    }


    public Student[] list() {
        Student[] arrStudent = new Student[list.size()];
        int i = 0;
        for (StudentEntry lObject : list) {
            //cast needed
            StudentEntry tObject = (StudentEntry) lObject;
            arrStudent[i] = new Student(tObject.FirstName, tObject.LastName);
            i++;
        }
        return arrStudent;
    }

    @Override
    public String toString() {
        String retString = "StudentDB{ ";
        for (StudentEntry lObject : list) {
            //cast needed
            StudentEntry tObject = (StudentEntry) lObject;
            retString += "( " + tObject.LastName + ", " + tObject.FirstName + ") ";
        }
        retString += " }";
        return retString;
    }

    public Student randomStudent() {
        Random rand = new Random();
        int iRand = rand.nextInt(list.size());
        StudentEntry element = list.get(iRand);

        Student retStudent = new Student(element.FirstName, element.LastName);

        return retStudent;
    }
}

