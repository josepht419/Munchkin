package door_cards;

import basic_game_components.Card;

/**
* This class represents a helper card in the game of Munchkin.
*/
public class HelperCard extends Card {

    //----------------------------------------------------
    //			CONSTRUCTOR(S)
    //----------------------------------------------------

    /**
     * This method constructs a Helper card.
     * @param name The unique name of the card.
     * @return 
     */
    public HelperCard(String name) {
        super(name, "door");
    }
        

}
