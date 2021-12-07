package ModelDay2;

import Model.StudentDB;

import java.util.ArrayList;
import java.util.List;

/*
Erstelle eine Klasse Univerity mit den Attributen:

Name der Uni
Array mit allen Studenten der Uni
studentRepresentative der Studenten Vertreter
mit den Methoden:




setStudentRepresentative um den Studenten Vertreter zu setzten

 */
public class Univerity {
    private String sName;
    private int laseMatrikelnummer;
    List<Student> listStudents = new ArrayList<Student>();
    Student studentRepresentative;

    public Univerity() {
        sName = "Cooler Campus";
        laseMatrikelnummer = 0;
    }

    private boolean checkStudentValid(Student newStudent) {
        if (newStudent == null) return false;
        if (newStudent.getName().length() <= 0) return false;
        if (newStudent.getMatrikelnummer() > 0) return false;
        return true;
    }

    public boolean addStudent(Student newStudent) {
        if (checkStudentValid(newStudent) == false)
            return false;

        laseMatrikelnummer++;
        newStudent.setMatrikelnummer(laseMatrikelnummer);
        listStudents.add(newStudent);

        return true;
    }

   public boolean removeStudent(int iMatrikelnummer) {
        for (Student lObject : listStudents) {
            if (lObject.getMatrikelnummer() == iMatrikelnummer)
                return listStudents.remove(lObject);
        }

        return false;
    }

    public double getAverageGrade() {
        double tmpVal = 0.0;
        for (Student lObject : listStudents) {
            tmpVal += lObject.getValuation();
            }
        tmpVal = tmpVal / listStudents.size();
        return tmpVal;
    }


    public boolean setStudentRepresentative(int iMatrikelnummer) {
        for (Student lObject : listStudents) {
            if (lObject.getMatrikelnummer() == iMatrikelnummer) {
                lObject.setRepresentative(true);
                studentRepresentative = lObject;
                return true;
            }
        }
        return false;
    }


    public Student getBestStudent() {
        Student retBestStudent = null;
        double tmpVal = -1.0;
        for (Student lObject : listStudents) {
            if (lObject.getValuation() > tmpVal) {
                retBestStudent = lObject;
                tmpVal = lObject.getValuation();
            }
        }
        return retBestStudent;
    }

    public int getStudentCount() {
        return listStudents.size();
    }

    public String listStudents() {
        String retString = "";
        for (Student lObject : listStudents) {
            //cast needed
            IStudent tStudent = (IStudent) lObject;
            retString += "Name: " + tStudent.getName() + " - Kurs: " + tStudent.getCourse() + " \n";
        }
        retString += " \n";
        return retString;
    }
}
