package main.java.com.avndko.repo.task03.zoo.core;

import java.io.IOException;
import java.util.Arrays;

import static main.java.com.avndko.repo.task03.zoo.core.Animals.*;

public class Zoo {

    public void schedule() throws IOException {
        ScheduleIO scheduleIO = new ScheduleIO();
        Feeding feeding = new Feeding();

        scheduleIO.checkDate();
        scheduleIO.checkFeeding();

        System.out.println("Добро пожаловать в зоопарк! Режим питания и состояние животных в данный момент:");
        System.out.println(Arrays.toString(Animals.values()));

        feeding.feeding(Elephants);
        feeding.feeding(Foxes);
        feeding.feeding(Bears);
        feeding.feeding(Parrots);
    }
}
