package main.java.com.avndko.repo.task03.zoo.core;

import java.io.IOException;
import java.time.LocalTime;

public class Feeding {
    LocalTime localTime = LocalTime.now();
    ScheduleIO scheduleIO = new ScheduleIO();

    public void feeding(Animals animal) throws IOException {
        if (localTime.isAfter(animal.getTimeAfter()) && localTime.isBefore(animal.getTimeBefore()))
            scheduleIO.feed(animal);
    }
}
