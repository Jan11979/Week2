import week3.Animal;
import MedelDay3.AnimalList;
import Model.MyStudent;
import Model.StudentDB;
import ModelDay2.*;
import week3.Stone;
import week3.ThingList;
import week3.Tree;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.nio.file.Files;
import java.util.stream.Stream;


/**
 * Aufgabe: Interface
 * <p>
 * Mache deine Student-Klasse zu einem Interface
 * Lasse zwei konkrete Klassen das Student-Interface implementieren (z.B. Informatik-/ Geschichtsstudent)
 * Füge eine Methode zu Student hinzu, die von den zwei implementierenden Klassen verschieden implementiert werden.
 * <p>
 * Aufgabe: Vererbung
 * <p>
 * Mache aus deinem Student Interface eine Klasse und lasse zwei Klassen von dieser erben
 * Überlege was die Unterschiede zwischen der Verwendung eines Interfaces und Vererbung sind
 * und schreibe Vor- und Nachteile auf
 * Mache aus deiner Student-Klasse eine Abstrakte Klasse mit einer Abstrakten Methode “anzahlModule”.
 */

public class Main {
    static boolean integerBigger0(Integer i) {
        return i > 0;
    }

    static int globalSumme = 0;
    static int globalProdukt = 0;

    static void AddToAll(Integer i) {
        globalSumme += i;
    }

    static void ProduktOfAll(Integer i) {
        if (globalProdukt == 0)
            globalProdukt = 1;
        globalProdukt *= i;
    }

    static boolean isNotHeadline(String s) {
        if (s.contains("ID"))
            return false;
//        if (s.length() <= 1)
//            return false;
        int count = 0;
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) == ',')
                count++;
        if (count < 3)
            return false;

        return true;
    }


    public static void main(String[] args) throws IOException {

        /*int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i< zahlen.length; i++)
            list.add( zahlen[i] );*/
        int[] zahlen = new int[]{9, 1, 8, 2, 7, 3, 6, 4, 5};
        List<Integer> list = Arrays.asList(9, 1, 8, 2, 7, 3, 6, 4, 5);
        List<Integer> list2 = new ArrayList<Integer>();


        list2 = list.stream()
                .filter(Main::integerBigger0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list2);

        System.out.println("Summe= " + globalSumme);
        list.stream().forEach(Main::AddToAll);
        System.out.println("Summe= " + Arrays.stream(zahlen).sum());
        System.out.println("Summe= " + globalSumme);

        System.out.println("Produkt= " + globalProdukt);
        list.stream().forEach(Main::ProduktOfAll);
        System.out.println("Produkt= " + Arrays.stream(zahlen).reduce(1, (a, b) -> a * b));
        System.out.println("Produkt= " + globalProdukt);

/**     Schaue dir die Datei students.csv an.
 Nutze Streams um die Datei zeilenweise einzulesen und auszugeben (Tipp: Files.lines(Path.of("students.csv")))
 Entferne dabei die Überschrift
 Wandel die Zeilen jeweils in die Klasse Student um
 Entferne ungültige Zeilen und Duplikate
 */


        String allText = Files.readString(Path.of("src/main/resources/students.csv"));
        Stream<String> text = Files.lines(Path.of("src/main/resources/students.csv"));
        System.out.println(allText);

        System.out.println("Mukki");

        List<StreamStudent> listStudents = new ArrayList<StreamStudent>();

        //  text
        //text.distinct().filter( Main::isNotHeadline ).forEach(System.out::println);
        text.distinct().filter(Main::isNotHeadline).forEach((s) -> listStudents.add(new StreamStudent(s)));

//        StreamStudent
        System.out.println(listStudents);
        System.out.println("mauz");


//        List<String> list2 = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
//        List<String> sortedList = list2.stream().sorted().collect(Collectors.toList());

//        sortedList.forEach(System.out::println);
        //       .forEachOrdered(System.out::println);


//        .map(e -> e.toLowerCase())
        /*

        AnimalList aList = new AnimalList();

        Animal bobby = new Animal("Bobby");
        aList.add(new Animal("Mukki"));
        aList.add(new Animal("Bobi"));
        aList.add(bobby);
        aList.add(new Animal("Sammy"));
        aList.add(new Animal("Buster"));
        aList.add(bobby);
        aList.add(new Animal("Pisa"));

        System.out.println(aList.toString());
        aList.remove(bobby);
        System.out.println(aList.toString());
*/

        ThingList aList = new ThingList();

        Animal bobby = new Animal("Bobby");
        aList.add(new Animal("Mukki"));
        aList.add(new Tree(2.6));
        aList.add(new Animal("Bobi"));
        aList.add(new Stone(3));
        aList.add(bobby);
        aList.add(new Animal("Sammy"));
        aList.add(new Stone(5));
        aList.add(new Animal("Buster"));
        aList.add(bobby);
        aList.add(new Tree(6.8));
        aList.add(new Animal("Pisa"));

        System.out.println(aList.toString());
        aList.remove(bobby);
        System.out.println(aList.toString());


/**
 Vor- und Nachteile von Interfaces und Vererbung
 -  Interfaces können mehrfach angewendet werden !!!
 -  Interfaces sind schlanker
 -  reduzieren sich nur auf Funktionen und geben dem Kollegen Freiraum

 -  Ansonsten ist Vererbung die richtige Waffe.
 */

/*

        System.out.println("=======Univerity=============");
        Univerity uni = new Univerity();

        uni.addStudent(new HistoryScienceStudent("Fanny"));
        uni.addStudent(new ComputerScienceStudent("Jonny"));
        uni.addStudent(new HistoryScienceStudent("Petra"));
        uni.addStudent(new ComputerScienceStudent("Bob"));
        uni.addStudent(new HistoryScienceStudent("Susi"));
        uni.addStudent(new ComputerScienceStudent("Peter"));
        uni.addStudent(new HistoryScienceStudent("Joschua"));
        uni.addStudent(new HistoryScienceStudent("Peter"));

        System.out.println(uni.listStudents());
        System.out.println("Stundenten Count = " + uni.getStudentCount());
        System.out.println("remove(3) = " + uni.removeStudent(3));
        System.out.println("Stundenten Count = " + uni.getStudentCount());
        System.out.println(uni.listStudents());
        System.out.println("Best Student= " + uni.getBestStudent().getName());
        System.out.println("Durchschnitt= " + uni.getAverageGrade());
        System.out.println("setStudentRepresentative= " + uni.setStudentRepresentative(1));

*/

/*
        IStudent [] listInterface = new IStudent[2];
        listInterface[0] = new ComputerScienceStudent();
        listInterface[1] = new HistoryScienceStudent("Fanny");

        System.out.println("=======Interface=============");
        for (IStudent item : listInterface) {
            ICabinet Schrank = (ICabinet) item;
            System.out.println(item.getName());
            System.out.println(item.getCourse());
            if( Schrank.getCabinetNumber() > 0 )
                System.out.println("Spind = " + Schrank.getCabinetNumber());
            System.out.println("---------------------------------");
        }


        Student [] listStudent = new Student[2];
        listStudent[0] = new ComputerScienceStudent();
        listStudent[1] = new HistoryScienceStudent("Fanny");

        System.out.println("==========Vererbt===========");
        for (Student item : listStudent) {
            System.out.println(item.getName());
            System.out.println(item.getCourse());
            System.out.println("Module = " + item.anzahlModule());
            System.out.println("Note = " + item.getValuation());
            System.out.println("Studenten-Vertreter = " + item.getRepresentative());

            System.out.println("---------------------------------");
        }

 */
/*

        StudentDB.Student[] sList = new StudentDB.Student[3];
        sList[0] = new StudentDB.Student("Jan1", "Mueller1");
        sList[1] = new StudentDB.Student("Jan2", "Mueller2");
        sList[2] = new StudentDB.Student("Jan3", "Mueller3");

        StudentDB studentDB = new StudentDB(sList);
        StudentDB.Student[] NewList = studentDB.list();

        String alleStudenten = studentDB.toString();
        System.out.println(alleStudenten);

        StudentDB.Student randStudent = studentDB.randomStudent();
        System.out.println("Random=" + randStudent.FirstName + ", " + randStudent.LastName);

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
