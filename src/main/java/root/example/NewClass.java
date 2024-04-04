package root.example;

public class NewClass {
    private int a;
    private int b;
    private void print() {
        System.out.println("print nothing");
    }

    private int privateSum(int a, int b) {
        return a + b;
    }

    public double getSum(int a, int b) {
        return privateSum(a, b);
    }
}
