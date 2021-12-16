package week3;

public class Animal {
    public String name;
    public Animal(String n){
        name = n;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "'" + name + '\'' +
                '}';
    }
}
