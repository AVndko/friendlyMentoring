package main.java.com.avndko.repo.task03.zoo;

import main.java.com.avndko.repo.task03.zoo.core.Zoo;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        Zoo zoo = new Zoo();
        zoo.schedule();
    }
}
