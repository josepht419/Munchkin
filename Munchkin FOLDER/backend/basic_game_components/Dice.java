package basic_game_components;

import java.util.Random;

public class Dice {
    
    //----------------------------------------------------
    //            INSTANCE VARIABLES
    //----------------------------------------------------

    private Random rand;

    private static int MIN = 1;
    private static int MAX = 6;

    //----------------------------------------------------
    //            CONSTRUCTOR(S)
    //----------------------------------------------------

    public Dice() {
        rand = new Random();
    }
    
    //----------------------------------------------------
    //            METHOD(S)
    //----------------------------------------------------

    public int rollDice() {
        return rand.nextInt(MAX) + MIN;
    }

}
