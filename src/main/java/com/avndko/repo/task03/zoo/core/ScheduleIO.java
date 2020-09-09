package main.java.com.avndko.repo.task03.zoo.core;

import java.io.*;
import java.time.*;
import java.util.Scanner;

import static main.java.com.avndko.repo.task03.zoo.core.Animals.*;

public class ScheduleIO {
    private final File FeedingSchedule = new File("src/main/java/com/avndko/repo/task03/zoo/core/FeedingSchedule.txt");
    private final LocalDate DATE = LocalDate.now();

    public void checkDate() throws IOException {
        try (FileReader fileReader = new FileReader(FeedingSchedule)) {
                Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNext()) {
                if (String.valueOf(DATE).equals(scanner.nextLine())) break;
                if (!scanner.hasNext()) writeNewDay();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void writeNewDay() throws IOException {
        try (FileWriter fileWriter = new FileWriter(FeedingSchedule, true)) {
            fileWriter.write("\n" + DATE +"\n");
            fileWriter.write(Elephants.getTitle() + "\n");
            fileWriter.write(Elephants.getState() + "\n");
            fileWriter.write(Foxes.getTitle() + "\n");
            fileWriter.write(Foxes.getState() + "\n");
            fileWriter.write(Bears.getTitle() + "\n");
            fileWriter.write(Bears.getState() + "\n");
            fileWriter.write(Parrots.getTitle() + "\n");
            fileWriter.write(Parrots.getState() + "\n");

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void checkFeeding() throws IOException {
        try (FileReader fileReader = new FileReader(FeedingSchedule)) {
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                String z = scanner.nextLine();
                if (Elephants.getTitle().equals(z)) {
                    if (scanner.nextLine().equals("true")) Elephants.setState(true);
                    else Elephants.setState(false);
                } else if (Foxes.getTitle().equals(z)) {
                    if (scanner.nextLine().equals("true")) Foxes.setState(true);
                    else Foxes.setState(false);
                } else if (Bears.getTitle().equals(z)) {
                    if (scanner.nextLine().equals("true")) Bears.setState(true);
                    else Bears.setState(false);
                } else if (Parrots.getTitle().equals(z)) {
                    if (scanner.nextLine().equals("true")) Parrots.setState(true);
                    else Parrots.setState(false);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void feed(Animals Animal) throws IOException {
        try (FileWriter fileWriter = new FileWriter(FeedingSchedule, true)) {
            if (Animal.getState()) System.out.println("Хорошо, что Вы к нам заглянули, но " + Animal.getTitle()+" сегодня уже ели.");
            else {
            Animal.setState(true);
            fileWriter.write(Animal.getTitle() + "\n");
            fileWriter.write(Animal.getState() + "\n");
                System.out.println(Animal.getTitle() + " говорят Вам спасибо за то, что вы их накормили!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}