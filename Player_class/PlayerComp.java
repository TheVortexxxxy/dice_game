/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pio;

import java.util.Random;

/**
 *
 * @author Student
 */
public class PlayerComp extends Player {

    private Random random = new Random();

    @Override
    public int guess() {
        return (random.nextInt(6) + 1);
    }
}
