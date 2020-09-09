package main.java.com.avndko.repo.task02.cinema.core;

import java.util.Random;
import java.util.Scanner;

public class Cinema {
    private final static String[][] FIELD = new String[10][10];
    private static int count = 0;

    private void fieldFill() {
        System.out.println("Места:       1        2        3        4        5        6        7        8        9       10");

        Random random = new Random();
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                FIELD[i][j] = (random.nextInt(2) == 0)?"  FREE  ":"RESERVED";
            }
        }
        for (int i = 0; i < FIELD.length; i++, System.out.println()) {
            System.out.print("Ряд   "+(i + 1)+"  ");
            for (int j = 0; j < FIELD[i].length; j++) {
                System.out.print(FIELD[i][j] + " ");
            }
        }
    }

    private void checkStrings2peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
               if (j > 0 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])) {
                   System.out.println("Парочка может сесть на "+ j + " и " + (j + 1) + " места в " + (i + 1) +" ряду.");
                   count++;
               }
            }
        }
    }

    private void checkColumns2peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 0 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])) {
                    System.out.println("Парочка может сесть на места с номером "+ (j + 1) + " в " + i + " и " + (i + 1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings3peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 1 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2])) {
                    System.out.println("В троём можно сесть на " + (j - 1) + ", " + j + " и " + (j + 1) + " места в " + (i + 1)
                                        + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns3peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 1 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j])) {
                    System.out.println("В троём можно сесть на места с номером " + (j + 1) + " в " + (i - 1) + ", " + i + " и "
                            + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings4peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 2 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])) {
                    System.out.println("В четвером можно сесть на " + (j - 2) + ", " + (j - 1) + ", " + j + " и " + (j + 1)
                            + " места в " + (i + 1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns4peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 2 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])) {
                    System.out.println("В четвером можно сесть на места с номером " + (j + 1) + " в " + (i - 2) + ", " + (i - 1)
                            + ", " + i + " и " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings5peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 3 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])
                        && FIELD[i][j].equals(FIELD[i][j - 4])) {
                    System.out.println("В пятером можно сесть на "+ (j - 3) + ", " + (j - 2) + ", " + (j - 1) + ", " + j + " и "
                            + (j + 1) + " места в " + (i + 1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns5peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 3 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])
                        && FIELD[i][j].equals(FIELD[i - 4][j])) {
                    System.out.println("В пятером можно сесть на места с номером " + (j + 1) + " в " + (i - 3) + ", " + (i - 2)
                            + ", " + (i - 1) + ", " + i + " и " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings6peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 4 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])
                        && FIELD[i][j].equals(FIELD[i][j - 4]) && FIELD[i][j].equals(FIELD[i][j - 5])) {
                    System.out.println("В шестером можно сесть на " + (j - 4) + ", " + (j - 3) + ", " + (j - 2) + ", " + (j - 1)
                            + ", " + j + " и " + (j + 1) + " места в " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns6peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 4 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])
                        && FIELD[i][j].equals(FIELD[i - 4][j]) && FIELD[i][j].equals(FIELD[i - 5][j])) {
                    System.out.println("В шестером можно сесть на места с номером " + (j + 1) + " в " + (i - 4) + ", " + (i - 3)
                            + ", " + (i - 2) + ", " + (i - 1) + ", " + i + " и " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings7peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 5 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])
                        && FIELD[i][j].equals(FIELD[i][j - 4]) && FIELD[i][j].equals(FIELD[i][j - 5])
                        && FIELD[i][j].equals(FIELD[i][j - 6])) {
                    System.out.println("В семером можно сесть на " + (j - 5) + ", " + (j - 4) + ", " + (j - 3) + ", " + (j - 2)
                            + ", " + (j - 1) + ", " + j + " и " + (j + 1) + " места в " + (i + 1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns7peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 5 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])
                        && FIELD[i][j].equals(FIELD[i - 4][j]) && FIELD[i][j].equals(FIELD[i - 5][j])
                        && FIELD[i][j].equals(FIELD[i - 6][j])) {
                    System.out.println("В семером можно сесть на места с номером " + (j + 1) + " в " + (i - 5) + ", " + (i - 4)
                            + ", " + (i - 3) + ", " + (i - 2) + ", " + (i - 1) + ", " + i + " и " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings8peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 6 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])
                        && FIELD[i][j].equals(FIELD[i][j - 4]) && FIELD[i][j].equals(FIELD[i][j - 5])
                        && FIELD[i][j].equals(FIELD[i][j - 6]) && FIELD[i][j].equals(FIELD[i][j - 7])) {
                    System.out.println("В восьмером можно сесть на " + (j - 6) + ", " + (j - 5) + ", " + (j - 4) + ", " + (j - 3)
                            + ", " + (j - 2) + ", " + (j - 1) + ", " + j + " и " + (j + 1) + " места в " + (i + 1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns8peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 6 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])
                        && FIELD[i][j].equals(FIELD[i - 4][j]) && FIELD[i][j].equals(FIELD[i - 5][j])
                        && FIELD[i][j].equals(FIELD[i - 6][j]) && FIELD[i][j].equals(FIELD[i - 7][j])) {
                    System.out.println("В восьмером можно сесть на места с номером " + (j + 1) + " в " + (i - 6) + ", " + (i - 5)
                            + ", " + (i - 4) + ", " + (i - 3) + ", " + (i - 2) + ", " + (i - 1) + ", " + i + " и " + (i + 1)
                            + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings9peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 7 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])
                        && FIELD[i][j].equals(FIELD[i][j - 4]) && FIELD[i][j].equals(FIELD[i][j - 5])
                        && FIELD[i][j].equals(FIELD[i][j - 6]) && FIELD[i][j].equals(FIELD[i][j - 7])
                        && FIELD[i][j].equals(FIELD[i][j - 8])) {
                    System.out.println("В девятером можно сесть на " + (j - 7) + ", " + (j - 6) + ", " + (j - 5) + ", " + (j - 4)
                            + ", " + (j - 3) + ", " + (j - 2) + ", " + (j - 1) + ", " + j + " и " + (j + 1) + " места в " + (i + 1)
                            +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns9peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 7 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])
                        && FIELD[i][j].equals(FIELD[i - 4][j]) && FIELD[i][j].equals(FIELD[i - 5][j])
                        && FIELD[i][j].equals(FIELD[i - 6][j]) && FIELD[i][j].equals(FIELD[i - 7][j])
                        && FIELD[i][j].equals(FIELD[i - 8][j])) {
                    System.out.println("В девятером можно сесть на места с номером " + (j + 1) + " в " + (i - 7) + ", " + (i - 6)
                            + ", " + (i - 5) + ", " + (i - 4) + ", " + (i - 3) + ", " + (i - 2) + ", " + (i - 1) + ", " + i
                            + " и " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    private void checkStrings10peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (j > 8 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i][j - 1])
                        && FIELD[i][j].equals(FIELD[i][j - 2]) && FIELD[i][j].equals(FIELD[i][j - 3])
                        && FIELD[i][j].equals(FIELD[i][j - 4]) && FIELD[i][j].equals(FIELD[i][j - 5])
                        && FIELD[i][j].equals(FIELD[i][j - 6]) && FIELD[i][j].equals(FIELD[i][j - 7])
                        && FIELD[i][j].equals(FIELD[i][j - 8]) && FIELD[i][j].equals(FIELD[i][j - 9])) {
                    System.out.println("В десятером можно сесть на " + (j - 8) + ", " + (j - 7) + ", " + (j - 6) + ", " + (j - 5)
                            + ", " + (j - 4) + ", " + (j - 3) + ", " + (j - 2) + ", " + (j - 1) + ", " + j + " и " + (j + 1)
                            + " места в " + (i + 1) +" ряду.");
                    count++;
                }
            }
        }
    }

    private void checkColumns10peoples() {
        for (int i = 0; i < FIELD.length; i++) {
            for (int j = 0; j < FIELD[i].length; j++) {
                if (i > 8 && FIELD[i][j].equals("  FREE  ") && FIELD[i][j].equals(FIELD[i - 1][j])
                        && FIELD[i][j].equals(FIELD[i - 2][j]) && FIELD[i][j].equals(FIELD[i - 3][j])
                        && FIELD[i][j].equals(FIELD[i - 4][j]) && FIELD[i][j].equals(FIELD[i - 5][j])
                        && FIELD[i][j].equals(FIELD[i - 6][j]) && FIELD[i][j].equals(FIELD[i - 7][j])
                        && FIELD[i][j].equals(FIELD[i - 8][j]) && FIELD[i][j].equals(FIELD[i - 9][j])) {
                    System.out.println("В десятером можно сесть на места с номером " + (j + 1) + " в " + (i - 8) + ", " + (i - 7)
                            + ", " + (i - 6) + ", " + (i - 5) + ", " + (i - 4) + ", " + (i - 3) + ", " + (i - 2) + ", " + (i - 1)
                            + ", " + i + " и " + (i + 1) + " ряду.");
                    count++;
                }
            }
        }
    }

    public void buyTickets() {
        Cinema cinema = new Cinema();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в кинотеатр! Сколько вас человек? (от 2 до 10):");
        int p= scanner.nextInt();

        switch (p) {
            case 2 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings2peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns2peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 3 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings3peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns3peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 4 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings4peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns4peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 5 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings5peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns5peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 6 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings6peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns6peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 7 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings7peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns7peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 8 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings8peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns8peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 9 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings9peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns9peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            case 10 -> {
                cinema.fieldFill();
                System.out.println();
                System.out.println("Горизонтальная близость:");
                cinema.checkStrings10peoples();
                if (count == 0) System.out.println("По горизонтали нет соседних мест.");
                count = 0;
                System.out.println();
                System.out.println("Вертикальная близость:");
                cinema.checkColumns10peoples();
                if (count == 0) System.out.println("По вертикали нет соседних мест.");
            }
            default -> {
                System.out.println("Введите количество человек от 2-х до 10-ти.");
                System.out.println();
                cinema.buyTickets();
            }
        }
    }
}
