package door_cards;

import basic_game_components.Card;

/**
 * This class represents a monster modifier card in the game of Munchkin.
 */
public class MonsterModifierCard extends Card {

    //----------------------------------------------------
	//			INSTANCE VARIABLES
	//----------------------------------------------------

    // The value of the level modifier the monster modifier provides to the monster.
    private int levelModValue;
    // The value of the treasure modifier the monster modifier provides to the monster.
    private int treasureModValue;
    
    //----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------
    

    /**
     * This method constructs a monster modifier card in the game.
     * @param name The unique name of the card.
     */
    public MonsterModifierCard(String name, int levelModValue, int treasureModValue) {
		super(name, "door");
        this.levelModValue = levelModValue;
        this.treasureModValue = treasureModValue;
    }

    
    //----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

    /**
     * This method gets the level mod value provided by the monster modifier to the monster.
     * @return The level mod value provided by the monster modifier to the monster.
     */
    public int getLevelModValue() {
        return levelModValue;
    }
    
    /**
     * This method gets the treasure mod value provided by the monster modifier to the monster.
     * @return The treasure mod value provided by the monster modifier to the monster.
     */

    public int getTreasureModValue() {
        return treasureModValue;
    }

} // End of MonsterModifier class.
