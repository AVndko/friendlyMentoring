package main.java.com.avndko.repo.task02.cinema.core;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
    private final static String[][] FIELD= new String[10][10];
    private static int count = 0;

    private static void fieldFill() {
        System.out.println("Места:       1        2        3        4        5        6        7        8        9       10");

        Random random = new Random();
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                FIELD[i][j] = (random.nextInt(2)==0)?"  FREE  ":"RESERVED";
            }
        }
        for (int i = 0; i < FIELD.length; i++, System.out.println()) {
            System.out.print("Ряд   "+(i+1)+"  ");
            for (int j = 0; j < FIELD[i].length; j++) {
                System.out.print(FIELD[i][j] + " ");
            }
        }
    }

    private static void checkStrings2people(){
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
               if(j > 0 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j-1])) {
                   System.out.println("Парочка может сесть на "+ j + " и " + (j+1) + " места в " + (i+1) +" ряду.");
                   count++;
               }
            }
        }
    }

    private static void checkColumns2people(){
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if(i > 0 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i-1][j])) {
                    System.out.println("Парочка может сесть на места с номером "+ (j+1) + " в " + i + " и " + (i+1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private static void checkStrings5people(){
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if(j > 3 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j-1]) && FIELD[i][j].equals(FIELD[i][j-2])
                        && FIELD[i][j].equals(FIELD[i][j-3]) && FIELD[i][j].equals(FIELD[i][j-4])) {
                    System.out.println("В пятером можно сесть на "+ (j-3) + ", " + (j-2) + ", " + (j-1) + ", " + j + " и "
                            + (j+1) + " места в " + (i+1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private static void checkColumns5people(){
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if(i > 3 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i-1][j]) && FIELD[i][j].equals(FIELD[i-2][j])
                        && FIELD[i][j].equals(FIELD[i-3][j]) && FIELD[i][j].equals(FIELD[i-4][j])) {
                    System.out.println("В пятером можно сесть на места с номером " + (j+1) + " в " + (i-3) + ", " + (i-2) + ", "
                            + (i-1) + ", " + i + " и " + (i+1) + " ряду.");
                    count++;
                }
            }
        }
    }

    public static void buyTickets(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в кинотеатр! Сколько вас человек? (Надеюсь двое или пятеро):");
        int p= scanner.nextInt();

        if(p == 2){
            fieldFill();
            System.out.println();
            System.out.println("Горизонтаьлная близость:");
            checkStrings2people();
            if(count==0) System.out.println("По горизонтали нет соседних мест.");
            count=0;
            System.out.println();
            System.out.println("Вертикальная близость:");
            checkColumns2people();
            if(count==0) System.out.println("По вертикали нет соседних мест.");
        }
        else if (p==5){
            fieldFill();
            System.out.println();
            System.out.println("Горизонтаьлная близость:");
            checkStrings5people();
            if(count==0) System.out.println("По горизонтали нет соседних мест.");
            count=0;
            System.out.println();
            System.out.println("Вертикальная близость:");
            checkColumns5people();
            if(count==0) System.out.println("По вертикали нет соседних мест.");
        }
        else {
            System.out.println();
            System.out.println("Неа! Или двое, или пятеро.");
            System.out.println();
            buyTickets();
        }
    }
}
