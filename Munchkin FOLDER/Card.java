public class Card {
    //----------------------------------------------------
    //            INSTANCE VARIABLES
    //----------------------------------------------------

    // The card's unique name.
    private String name;
    // The card's pile type, "door" or "treasure".
    private String type;
    // The card's sub type within its respective pile type (ex: Headgear, Monster, Usable, etc.).
    private String subtype;

    //----------------------------------------------------
    //            CONSTRUCTOR(S)
    //----------------------------------------------------
    /*
     * This method constructs a Card object, the main super class of all the cards in the game.
     * @param name The card's unique name.
     * @param type The card's pile type, "door" or "treasure".
     * @param subtype The card's sub type within its respective pile type (ex: Headgear, Monster, 
                      Usable, etc.).
     */
    public Card(String name, String type, String subtype) {
        this.name = name;
        this.type = type;
        this.subtype = subtype;
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

    /*
     * Get the card's sub type within its respective pile type (ex: Headgear, Monster, Usable, 
       etc.).
     * @return the card's sub type within its respective pile type (ex: Headgear, Monster, 
               Usable, etc.).
     */
    public String getSubtype() {
        return subtype;
    }
}