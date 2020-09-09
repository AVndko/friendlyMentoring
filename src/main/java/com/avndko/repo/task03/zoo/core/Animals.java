package main.java.com.avndko.repo.task03.zoo.core;

import java.time.LocalTime;

public enum Animals {
    Elephants ("Слоны", false, 0, 0, 5, 59),
    Foxes ("Лисы", false, 6, 0, 11, 59),
    Bears ("Медведи", false, 12,0,17,59),
    Parrots ("Попугаи", false,18,0,23,59);

    private String title;
    private Boolean state;
    private LocalTime timeAfter;
    private LocalTime timeBefore;

    Animals(String title, Boolean state, int hoursAfter, int minutesAfter , int hoursBefore, int minutesBefore) {
        this.title = title;
        this.state = state;
        this.timeAfter = LocalTime.of(hoursAfter,minutesAfter);
        this.timeBefore = LocalTime.of(hoursBefore, minutesBefore);
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getState() {
        return state;
    }

    public LocalTime getTimeAfter() {
        return timeAfter;
    }

    public LocalTime getTimeBefore() {
        return timeBefore;
    }

    @Override
    public String toString() {
        if (state) return "\n" + title + " едят с " + timeAfter + " до " + timeBefore + " и сегодня уже поели";
        else return "\n" + title + " едят с " + timeAfter + " до " + timeBefore + " и сегодня ещё не ели";
    }
}
