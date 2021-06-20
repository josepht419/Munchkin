package treasure_cards;

import basic_game_components.Card;


/**
 * This class represents an simple usable once card in the game of Munchkin.
 */
public class OneShotTreasureCard extends Card {

    //----------------------------------------------------
	//			INSTANCE VARIABLES
	//----------------------------------------------------

    // The combat bonus the simple usable once item applies to target.
    private int combatBonus;

    // The gold value of the one shot treasure.
    private int goldValue;

    private boolean eitherSidePlayableStatus;

    //----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------

    /**
     * This method constructs a simple usable once item in the game.
     * @param name The unique name of the card.
     * @param combatBonus The combat bonus the usable once item provides
     */
    public OneShotTreasureCard(String name, int combatBonus, int goldValue, boolean eitherSidePlayableStatus) {
        super(name, "treasure");
        this.combatBonus = combatBonus;
        this.goldValue = goldValue;
        this.eitherSidePlayableStatus = eitherSidePlayableStatus;
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

    public int getGoldValue() {
        return combatBonus;
    }

    public boolean getEitherSidePlayableStatus() {
        return eitherSidePlayableStatus;
    }

} // End of UsableOnce class.