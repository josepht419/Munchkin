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

}