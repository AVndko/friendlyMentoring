package main.java.com.avndko.repo.task04.fibonacci;

import main.java.com.avndko.repo.task04.fibonacci.core.*;
//import static main.java.com.avndko.repo.task04.fibonacci.core.Fibonacci.*;

public class App {
    public static void main(String[] args) {
        int n = 25;
        Fibonacci f = new Fibonacci(n);
        int x = f.recursionFibonacci(n);
        System.out.println(x);
        System.out.println();
        System.out.println(f);
    }
}
