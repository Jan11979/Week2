public class Student {
    private static String sFirstName;
    private static String sLastName;
    private static int iSemesterCount;

    public static String getFirstName() {
        return sFirstName;
    }

    public static void setFirstName(String sFirstName) {
        Student.sFirstName = sFirstName;
    }

    public static String getLastName() {
        return sLastName;
    }

    public static void setLastName(String sLastName) {
        Student.sLastName = sLastName;
    }

    public static int getSemesterCount() {
        return iSemesterCount;
    }

    public static void setSemesterCount(int iSemesterCount) {
        Student.iSemesterCount = iSemesterCount;
    }
}
