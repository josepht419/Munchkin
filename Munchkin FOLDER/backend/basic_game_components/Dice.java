package basic_game_components;

import java.util.Random;

/** 
 * This class simulates a six-sided dice in the game of Munchkin. A dice is used for running away from monsters, deciding turn order before the 
 * game starts, and for all other certain situations that require a dice roll.
 */
public class Dice {
    
    //----------------------------------------------------
    //            INSTANCE VARIABLES
    //--------------------------------------------------- -

    // Java's random generator class (used for dice results).
    private Random rand;

    // It's a six-sided dice, so the result is always values 1-6.
    private final int MIN = 1;
    private final int MAX = 6;

    //----------------------------------------------------
    //            CONSTRUCTOR(S)
    //----------------------------------------------------

    /**
     * This method constructs a Dice object.
     */
    public Dice() {
        rand = new Random();
    }
    
    //----------------------------------------------------
    //            METHOD(S)
    //----------------------------------------------------

    /**
     * This method rolls the six-sided dice.
     * @return An int value, 1-6 (results of the dice roll).
     */
    public int roll() {
        return rand.nextInt(MAX) + MIN;
    }

}
