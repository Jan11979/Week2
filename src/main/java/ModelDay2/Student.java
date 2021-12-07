package ModelDay2;

import java.util.Random;

public abstract class Student implements IStudent, ICabinet {

    String  sName;
    private int iMatrikelnummer;
    private double valuation;
    private boolean isRepresentative;

    public Student(String sNewName) {
        this.sName = sNewName;
        valuation = 0.0;
        iMatrikelnummer = 0;
        isRepresentative = false;


        //Schnell Schnell :-)
        Random r = new Random();
        valuation = r.nextDouble();
    }
    public Student() {
        this.sName = "Jonny";
        valuation = 0.0;
        iMatrikelnummer = 0;
        isRepresentative = false;}

    public abstract String getCourse();
    public abstract int anzahlModule();

    public String getName() {
        return sName;
    }
    public int getMatrikelnummer() {
        return iMatrikelnummer;
    }
    public void setMatrikelnummer(int newMatrikelnummer) {
        iMatrikelnummer = newMatrikelnummer;
    }

    public double getValuation() {
        return valuation;
    }
    public void setValuation(double newValuation) {
        valuation = newValuation;
    }

    public boolean getRepresentative() {
        return isRepresentative;
    }
    public void setRepresentative(boolean newRepresentative) {
        isRepresentative = newRepresentative;
    }


    public int getCabinetNumber(){
        return 0;
    }
}
/*
    Erweitere die Abstrakte Klasse Student um:

        ein double für die Note des Students
        ein boolean isRepresentative um anzugeben ob dieser Studenten der Studenten-Vertreter ist.
*/