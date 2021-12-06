import java.util.*;

public class Student {
    private static String sFirstName;
    private static String sLastName;
    private static int iSemesterCount;
    private static Date dBirthdate;

    public Student(){
        sFirstName = "";
        sLastName = "";
        iSemesterCount = 0;
        dBirthdate = new Date( );
    }

    public Date getBirthdate() {
        return this.dBirthdate;
    }

    public  void setBirthdate(Date dNewBirthdate) {
        if(dNewBirthdate == null)
            return;
        this.dBirthdate = dNewBirthdate;
    }

    public void setName(String sFirstName, String sLastName) {
        this.setFirstName(sFirstName);
        this.setLastName(sLastName);
    }

    public String getFirstName() {
        return this.sFirstName;
    }

    public void setFirstName(String sNewFirstName) {
        if(sNewFirstName == null)
            return;
        this.sFirstName = sNewFirstName;
    }

    public String getLastName() {
        return this.sLastName;
    }

    public void setLastName(String sNewLastName) {
        if(sNewLastName == null)
            return;
        this.sLastName = sNewLastName;
    }

    public int getSemesterCount() {
        return this.iSemesterCount;
    }

    public void setSemesterCount(int iSemesterCount) {
        this.iSemesterCount = iSemesterCount;
    }
}
