package ModelDay2;

public abstract class Student implements IStudent, ICabinet {

    String sName;
    public Student(String sNewName) {
        this.sName = sNewName; }
    public Student() {
        this.sName = "Jonny"; }

    public abstract String getCourse();
    public abstract int anzahlModule();

    public String getName() {
        return sName;
    }

    public int getCabinetNumber(){
        return 0;
    }
}


