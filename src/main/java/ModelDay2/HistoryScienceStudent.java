package ModelDay2;

public class HistoryScienceStudent extends Student {
    public HistoryScienceStudent() {
        super();
    }

    public HistoryScienceStudent(String sNewName) {
        super.sName = sNewName;
    }

    public String getCourse() {
        return "History Science";
    }

    public int getCabinetNumber(){
        return 47;
    }

    public int anzahlModule() { return 2;}
}