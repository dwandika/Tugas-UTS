package uts;

public class Problem1 {

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
            return n * 8;
        } else {
            return n * 9;
        }
    }

    public static void main(String[] args) {
        System.out.println(simpleMultiplication(21));
        System.out.println(simpleMultiplication(26));

    }
}
