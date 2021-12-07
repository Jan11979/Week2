import Model.MyStudent;
import Model.StudentDB;
import ModelDay2.ICabinet;


import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Aufgabe: Interface

Mache deine Student-Klasse zu einem Interface
Lasse zwei konkrete Klassen das Student-Interface implementieren (z.B. Informatik-/ Geschichtsstudent)
Füge eine Methode zu Student hinzu, die von den zwei implementierenden Klassen verschieden implementiert werden.

Aufgabe: Vererbung

Mache aus deinem Student Interface eine Klasse und lasse zwei Klassen von dieser erben
Überlege was die Unterschiede zwischen der Verwendung eines Interfaces und Vererbung sind
    und schreibe Vor- und Nachteile auf
Mache aus deiner Student-Klasse eine Abstrakte Klasse mit einer Abstrakten Methode “anzahlModule”.

*/

public class Main {
    public static void main(String[] args) {

/*
Vor- und Nachteile von Interfaces und Vererbung
    -  Interfaces können mehrfach angewendet werden !!!
    -  Interfaces sind schlanker
    -  reduzieren sich nur auf Funktionen und geben dem Kollegen Freiraum

    -  Ansonsten ist Vererbung die richtige Waffe.
 */


        ModelDay2.IStudent [] listInterface = new ModelDay2.IStudent[2];
        listInterface[0] = new ModelDay2.ComputerScienceStudent();
        listInterface[1] = new ModelDay2.HistoryScienceStudent("Fanny");

        System.out.println("=======Interface=============");
        for (ModelDay2.IStudent item : listInterface) {
            ModelDay2.ICabinet Schrank = (ICabinet) item;
            System.out.println(item.getName());
            System.out.println(item.getCourse());
            if( Schrank.getCabinetNumber() > 0 )
                System.out.println("Spind = " + Schrank.getCabinetNumber());
            System.out.println("---------------------------------");
        }


        ModelDay2.Student [] listStudent = new ModelDay2.Student[2];
        listStudent[0] = new ModelDay2.ComputerScienceStudent();
        listStudent[1] = new ModelDay2.HistoryScienceStudent("Fanny");

        System.out.println("==========Vererbt===========");
        for (ModelDay2.Student item : listStudent) {
            System.out.println(item.getName());
            System.out.println(item.getCourse());
            System.out.println("Module = " + item.anzahlModule());
            System.out.println("---------------------------------");
        }
/*
        ModelDayX2.ModelDayX2.Student[] sList = new ModelDayX2.ModelDayX2.Student[3] ;
        sList[0] = new StudentDB.ModelDayX2.ModelDayX2.Student("Jan1","Mueller1");
        sList[1] = new StudentDB.ModelDayX2.ModelDayX2.Student("Jan2","Mueller2");
        sList[2] = new StudentDB.ModelDayX2.ModelDayX2.Student("Jan3","Mueller3");

        StudentDB studentDB = new StudentDB(sList);
        ModelDayX2.ModelDayX2.Student[] NewList = studentDB.list();

        String alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);

        ModelDayX2.ModelDayX2.Student randStudent = studentDB.randomStudent();
        System.out.println("Random=" + randStudent.FirstName + ", " + randStudent.LastName );

        alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);
        studentDB.removeStudent(2);
        alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);
        */



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
