package pio;

import java.util.Random;

public class PlayerComp extends Player {

    private Random random = new Random();

    @Override
    public int guess() {
        return (random.nextInt(6) + 1);
    }
}
