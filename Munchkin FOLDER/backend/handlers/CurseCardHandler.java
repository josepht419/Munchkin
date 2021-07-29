package handlers;

import basic_game_components.Card;
import basic_game_components.player_stuff.Player;
import basic_game_components.player_stuff.InPlayCards;

import java.util.List;

public abstract class CurseCardHandler {
    //----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

    public static void handleCurse(String name) {

        switch(name) {
            case "Curse! Change Class":
                return;
            case "Curse! Change Race":
                return;
            case "Curse! Change Sex":
                return;
            case "Curse! Chicken On Your Head":
                return;
            case "Curse! Duck Of Doom":
                return;
            case "Curse! Income Tax":
                return;
            case "Curse! Lose A Big Item":
                return;
            case "Curse! Lose A Level":
                return;
            case "Curse! Lose A Small Item":
                return;
            case "Curse! Lose The Armor You Are Wearing":
                return;
            case "Curse! Lose The Footgear You Are Wearing":
                return;
            case "Curse! Lose The Headgear You Are Wearing":
                return;
            case "Curse! Lose Two Cards":
                return;
            case "Curse! Lose Your Class":
                return;
            case "Curse! Lose Your Race":
                return;
            case "Curse! Malign Mirror":
                return;
            case "Truly Obnoxious Curse!":
                return;

        } // End of switch statement.

    } // End of handleCurse method.

    private void changeClassCurse_Operation(Player player, List<Card> doorDiscards) {
          
    }

} // End of CurseCardHandler class.