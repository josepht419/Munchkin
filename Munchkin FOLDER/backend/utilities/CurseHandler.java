package handlers;

import basic_game_components.*;
import door_cards.*;
import treasure_cards.*;

public class CurseHandler {

    public static void handleCurse(Player targetPlayer, Card curse) {
        String curseCardName = curse.getName();

        switch(curseCardName) {
            case "Lose A Level" :
                if(targetPlayer.getLevel > 1)
                    targetPlayer.modifyLevel(-1);
                break;
            case "Lose Your Headgear" :
                //In progress 
                if(targetPlayer.getHeadgearOccupiedStatus() == true) {
                    targetPlayer.getHeadgearOccupiedStatus() = false;
                }
                
                break;
        }

    }

}