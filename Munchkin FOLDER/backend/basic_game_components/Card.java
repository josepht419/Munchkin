package basic_game_components;

/**
 * This class Card is the super class for all card varieties in the game of Munchkin. Objects like
 * Monster, Race, MonsterModifier, and so on, are all instances of Card. This is done in order to
 * place them all together in the same piles, same hand, and same in play cards despite their varying
 * characteristics and classifications.
 */
public class Card {
    //----------------------------------------------------
    //            INSTANCE VARIABLES
    //----------------------------------------------------

    // The card's unique name.
    private String name;
    // The card's pile type, "door" or "treasure".
    private String type;

    //----------------------------------------------------
    //            CONSTRUCTOR(S)
    //----------------------------------------------------
    
    /*
     * This method constructs a Card object, the main super class of all the cards in the game.
     * @param name The card's unique name.
     * @param type The card's pile type, "door" or "treasure".
     */
    public Card(String name, String type) {
        this.name = name;
        this.type = type;
    }

    //----------------------------------------------------
    // METHOD(S)
    //----------------------------------------------------

    /*
     * Get the card's unique name.
     * @return The card's unique name.
     */
    public String getName() {
        return name;
    }

    /*
     * Get the card's pile type, "door" or "treasure".
     * @return The card's pile type, "door" or "treasure".
     */
    public String getType() {
        return type;
    }

} // End of Card class.