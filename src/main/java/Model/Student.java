package Model;

import java.util.*;

public class Student {
    private String sFirstName;
    private String sLastName;
    private int iSemesterCount;
    private Calendar dBirthdate;

    public Student() {
        sFirstName = "";
        sLastName = "";
        iSemesterCount = 0;
        dBirthdate = new GregorianCalendar();
    }

   /* @Override
    public int hashCode() {
        int hash = 0;
        hash += (sFirstName == null ? 0 : sFirstName.hashCode());
        hash += (sLastName == null ? 0 : sLastName.hashCode());
        hash += (dBirthdate == null ? 0 : dBirthdate.hashCode());
        return hash;
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(sFirstName, sLastName, iSemesterCount, dBirthdate);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return iSemesterCount == student.iSemesterCount && Objects.equals(sFirstName, student.sFirstName) && Objects.equals(sLastName, student.sLastName) && Objects.equals(dBirthdate, student.dBirthdate);
    }


    @Override
    public String toString() {
        String sReturn = "Name: " + getLastName() + ", " + getFirstName();
        sReturn += "\nBirthdate:" + dBirthdate.getTime();// toString();
        return sReturn;
    }

    public int isBirthdayToday() {
        Date NowDate = new Date();
//        int test  = this.dBirthdate.getDay();
        //      int test2 = NowDate.getDate(). getDay();
        /*if( (this.dBirthdate.getMonth() == NowDate.getMonth() )
        && (this.dBirthdate.getDay() getDayOfMonth() == NowDate.getDayOfMonth() ) )
        {
            return NowDate.getYear() - this.dBirthdate.getYear();
        }*/
        return 0;
    }

    public Calendar getBirthdate() {
        return this.dBirthdate;
    }

    public void setBirthdate(Calendar dNewBirthdate) {
        if (dNewBirthdate == null)
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
        if (sNewFirstName == null)
            return;
        this.sFirstName = sNewFirstName;
    }

    public String getLastName() {
        return this.sLastName;
    }

    public void setLastName(String sNewLastName) {
        if (sNewLastName == null)
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
