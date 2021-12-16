import java.util.Scanner;

public class StreamStudent {
    int id;
    String Name;
    int postalCode;
    int age;

    public StreamStudent(String s) {
        if( s == null)
            return;
        if(s.length() == 0)
            return;
        // Auflösen 1,Stefan,12345,40
        String string = s;
        Scanner scanner = new Scanner(string);
        scanner.useDelimiter(",");
        id = scanner.nextInt();
        Name = scanner.next();
        postalCode = scanner.nextInt();
        age = scanner.nextInt();
    }

    @Override
    public String toString() {
        return "StreamStudent{" +
                "\nid=" + id +
                ", Name='" + Name + '\'' +
                ", postalCode=" + postalCode +
                ", age=" + age +
                '}';
    }
}
