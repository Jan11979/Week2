package ModelDay2;

public class ComputerScienceStudent extends Student {
    public ComputerScienceStudent() {
        super();
    }

    public ComputerScienceStudent(String sNewName) {
        super.sName = sNewName;
    }

    public String getCourse() {
        return "Computer Science";
    }
    public int anzahlModule() { return 42;}
}