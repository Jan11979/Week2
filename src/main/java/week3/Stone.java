package week3;

public class Stone {
    public int weight;
    public Stone(int n){
        weight = n;
    }

    @Override
    public String toString() {
        return "Stone{" +
                 weight + "kg" +
                '}';
    }
}
