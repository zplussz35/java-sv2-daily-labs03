package day03;

import java.util.Random;

public class GuessTheNumber {
    Random rand = new Random();
    private int randomint= rand.nextInt(100)+1;

    public int getRandomint() {
        return randomint;
    }
}
