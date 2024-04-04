package root.example;

public class FizzBuzz {
    public static void main(String[] args) {
        //from 1 to 50                              1/3 -> 1; 2/3 -> 2; 3/3 -> 0 ; 4/3 -> 1
        //evenly 3 -> fizz
        //evenly 5 -> buzz
        //evenly 3 & 5 -> fizzbuzz
        //else -> int

        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
