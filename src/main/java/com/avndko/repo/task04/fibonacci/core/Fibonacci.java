package main.java.com.avndko.repo.task04.fibonacci.core;

//import java.util.Arrays;

public class Fibonacci {
//    private static int n;
//    private static int[] fibonacciNumbers = new int[n];

    public int recursionFibonacci(int n) {
//        this.n = n;
//        int[] fibonacciNumbers = new int[n];
        if (n == 1) {
//            fibonacciNumbers[n-1] = 0;
            return 0;
        } else if (n == 2 || n == 3) {
//            fibonacciNumbers[n-1] = 1;
            return 1;
        } else if (n > 3 && n < 48) {
            int x = recursionFibonacci(n - 1) + recursionFibonacci(n - 2);
//            fibonacciNumbers[n-1] = x;
            return x;
        } else {
            System.out.println("Error!");
            return 0;
        }
    }

//    @Override
//    public String toString() {
//        return Arrays.toString(fibonacciNumbers);
//    }
}
