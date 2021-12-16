package week3;

public class Tree {
    public double height;
    public Tree(double n){
        height = n;
    }

    @Override
    public String toString() {
        return "Tree{" +
                height +"m" +
                '}';
    }
}
