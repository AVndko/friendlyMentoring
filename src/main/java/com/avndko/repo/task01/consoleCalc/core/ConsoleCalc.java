package main.java.com.avndko.repo.task01.consoleCalc.core;

import java.util.Scanner;

public class ConsoleCalc {

    public static int result;

    public static int calculate(){
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a= scanner.nextInt();

        System.out.print("Enter operation (+,-,*,/,%): ");
        char operation= scanner.next().charAt(0);

        System.out.print("Enter the second integer: ");
        int b= scanner.nextInt();

        switch (operation){
            case '+':
                result= a+b;
                break;
            case '-':
                result= a-b;
                break;
            case '*':
                result= a*b;
                break;
            case '/':
                result= a/b;
                break;
            case '%':
                result= a%b;
                break;
            default:
                System.out.println("Operation error!");
        }
        return result;
    }
}
