package main.java.com.avndko.repo.task04.fibonacci;

import main.java.com.avndko.repo.task04.fibonacci.core.*;
//import static main.java.com.avndko.repo.task04.fibonacci.core.Fibonacci.*;

public class App {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        int x = f.recursionFibonacci(25);
        System.out.println(x);
//        System.out.println();
//        System.out.println(f);
    }
}
