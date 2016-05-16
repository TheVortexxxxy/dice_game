package pio;

import java.util.Scanner;
/**
 *
 * @author Student
 */
public class PlayerHuman extends Player {
    
    private Scanner in = new Scanner(System.in);
    
    @Override
    public int guess() {
        return in.nextInt();
    }
    
}
