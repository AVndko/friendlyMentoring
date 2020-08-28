package main.java.com.avndko.repo.task01.consoleCalc;

import main.java.com.avndko.repo.task01.consoleCalc.core.ConsoleCalc;

public class App {
    public static void main(String[] args) {
        int result= new ConsoleCalc().calculate();
        System.out.println(result);
    }
}
