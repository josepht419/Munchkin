import basic_game_components.*;
import door_cards.*;
import treasure_cards.*;
import handlers.*;

import java.util.Scanner;


/**
 * This class is used to test functionalities of the Munchkin backend using console input and output.
 */
public class Controller {

    public static void main (String[] args) {
        
        Player p1 = new Player(1, "male");
        Card c1 = new CurseCard("Lose A Level");
        CurseHandler.handleCurse(p1, c1);

    } // End of main method.
    
} // End of Controller class.
    

