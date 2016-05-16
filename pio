package pio;

import java.util.Random;

public class PIO {

    private static final Random random = new Random();

    public static void main(String[] args) {
        
        Player ph = new PlayerComp();
        ph.setName("mati");

        int computer;
        int player = 0;

        do {
            computer = random.nextInt(6) + 1;
            //player = random.nextInt(6) + 1;
            player = ph.guess();

            System.out.println("Wylosowano " + computer);
            System.out.println("Gracz " +ph.getName()+ ": " + player);

            if (computer == player) {
                System.out.println("Brawo");
            } else {
                System.out.println("Żle");
            }
        } while (computer != player);
    }
}
