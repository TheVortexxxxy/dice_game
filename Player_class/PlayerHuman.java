package pio;

import java.util.Scanner;

public class PlayerHuman extends Player {
    
    private Scanner in = new Scanner(System.in);
    
    @Override
    public int guess() {
        return in.nextInt();
    }
    
}
