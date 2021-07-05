package basic_game_components;

import java.util.Random;

/** This class simulates a six-sided dice in the game of Munchkin. A dice is used to run away from monsters as well as 
 * deciding turn order before the game. 
 */
public class Dice {
    
    //----------------------------------------------------
    //            INSTANCE VARIABLES
    //----------------------------------------------------

    // Java's random generation class.
    private Random rand;

    // It's a six-sided dice, so the result is always values 1-6.
    private static int MIN = 1;
    private static int MAX = 6;

    //----------------------------------------------------
    //            CONSTRUCTOR(S)
    //----------------------------------------------------

    /**
     * This method constructs a dice object.
     */
    public Dice() {
        rand = new Random();
    }
    
    //----------------------------------------------------
    //            METHOD(S)
    //----------------------------------------------------

    /**
     * This method rolls the six-sided dice.
     * @return A int value, 1-6.
     */
    public int rollDice() {
        return rand.nextInt(MAX) + MIN;
    }

}
