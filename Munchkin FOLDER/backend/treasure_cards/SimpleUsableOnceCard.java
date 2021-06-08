package treasure_cards;

import basic_game_components.Card;


/**
 * This class represents an simple usable once card in the game of Munchkin.
 */
public class SimpleUsableOnceCard extends Card {

    //----------------------------------------------------
	//			INSTANCE VARIABLES
	//----------------------------------------------------

    // The combat bonus the simple usable once item applies to target.
    private int combatBonus;

    //----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------

    /**
     * This method constructs a simple usable once item in the game.
     * @param name The unique name of the card.
     * @param combatBonus The combat bonus the usable once item provides
     */
    public SimpleUsableOnceCard(String name, int combatBonus) {
        super(name, "treasure");
        this.combatBonus = combatBonus;
    }

    //----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

    /**
     * This method gets the combat bonus of the simple usable once item (if any).
     * @return The combat bonus of the simple usable once item (if any).
     */
    public int getCombatBonus() {
        return combatBonus;
    }

} // End of UsableOnce class.