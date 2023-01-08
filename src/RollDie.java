/**
 * This program prompts the user for a number of rolls, then
 * simulates rolling a single die (redundant, I know).
 *
 * @author Nirre Pluf {@literal <pluf@wfu.edu>}
 * @version 0.1, Jan. 8, 2023
 */

import java.util.*;

public class RollDie {
    /**
     * main method, are you read to roll? I can't hear you...
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);  // keyboard input
        Random die = new Random();                  // simulated die
        int numRolls = 0;                           // number of rolls

        /* ask for the number of rolls and error check */
        do {
            System.out.print("How many rolls -> ");
            numRolls = keyboard.nextInt();
        } while (numRolls < 0);

        /* roll that die */
        for (int i = 0; i < numRolls; i++)
            System.out.println("die is " + rollDie(die));
    }


    /**
     * Simulate rolling a standard 6-sided die, this ain't no D&D game
     *
     * @param die a Random object used for simulating a roll
     * @return an int between 1 and 6
     */
    public static int rollDie(Random die) {
        return Math.abs(die.nextInt() % 6) + 1;
    }
}


