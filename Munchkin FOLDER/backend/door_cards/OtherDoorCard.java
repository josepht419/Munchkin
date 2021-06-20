package door_cards;

import basic_game_components.Card;

/**
 * This class represents a special door card in the game of Munchkin. A special door card is a door card that
 * doesn't fall into the other categories of door cards (Class, Monster, MonsterModifier, Race). They have special
 * properties and descriptions that need a handler.
 */
public class OtherDoorCard extends Card {

    //----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------

    /**
     * This method constructs a special door card in the game. A special door card is a door card that doesn't 
     * fall into the other categories of door cards (Class, Monster, MonsterModifier, Race). They have special 
     * properties and descriptions that need a handler.
     * @param name The unique name of the card.
     */
    public OtherDoorCard(String name) {
        super(name, "door");
    }
    
} // End of SpecialDoor class.