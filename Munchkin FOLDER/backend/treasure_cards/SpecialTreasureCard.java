package treasure_cards;

import basic_game_components.Card;

/**
 * This class represents a special treasure card in the game of Munchkin. A special treasure card is a treasure card that
 * doesn't fall into the other categories of treasure cards (SimpleEquippableCard or SimpleUsableOnceCard). They have special
 * properties and descriptions that need a handler.
 */
public class SpecialTreasureCard extends Card {

    //----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------

    /**
     * This method constructs a special treasure card in the game. A special treasure card is a treasure card that doesn't 
     * fall into the other categories of treasure cards (SimpleEquippableCard and SimpleUsableOnceCard). They have special 
     * properties and descriptions that need a handler.
     * @param name
     */
    public SpecialTreasureCard(String name) {
        super(name, "treasure");
    }

} // End of SpecialTreasureCard class.