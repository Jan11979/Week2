package Model;

import java.util.*;
import java.util.Arrays;
import java.util.Random;

public class MyStudent {
    private String sFirstName;
    private String sLastName;
    private int iID;
//    private Calendar dBirthdate;

    public MyStudent() {
        sFirstName = "";
        sLastName = "";
        iID = 0;
//        dBirthdate = new GregorianCalendar();
    }

    @Override
    public int hashCode() {
        return Objects.hash(sFirstName, sLastName, iID/*, dBirthdate*/);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStudent student = (MyStudent) o;
        return iID == student.iID && Objects.equals(sFirstName, student.sFirstName) && Objects.equals(sLastName, student.sLastName) /*&& Objects.equals(dBirthdate, student.dBirthdate)*/;
    }


    @Override
    public String toString() {
        String sReturn = "Name: " + getLastName() + ", " + getFirstName();
        /*sReturn += "\nBirthdate:" + dBirthdate.getTime();// toString();*/
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

  /*  public Calendar getBirthdate() {
        return this.dBirthdate;
    }*/
/*
    public void setBirthdate(Calendar dNewBirthdate) {
        if (dNewBirthdate == null)
            return;
        this.dBirthdate = dNewBirthdate;
    }*/

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

    public int getStudentID() {
        return this.iID;
    }
}
