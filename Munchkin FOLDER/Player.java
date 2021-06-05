import java.util.ArrayList;
import java.util.List;

public class Player {
    //----------------------------------------------------
	//          INSTANCE VARIABLES
    //----------------------------------------------------

    // The player's ID number or turn order designation.
    private int playerNumber;
    // The player's base level.
    private int level;
    // The player's combat bonuses from equipment and modifier cards like potions, etc.
    private int combatBonus;
    // The player's run away bonus from equipment.
    private int runAwayBonus;
    // The player's current gold amount.
    private int goldAmount;
    // The player's hand, simulated by an ArrayList of Card objects,
    private List<Card> hand;
    // The player's hand limit, i.e. the max cards they can have in their hand before they end their turn.
    private int handLimit;
    // The cards the player has in play (ex: equipment, curses casted on the player, etc.).
    private List<Card> inPlayCards;

    //----------------------------------------------------
	//          CONSTRUCTOR(S)
    //----------------------------------------------------

    /**
     * This method constructs a Player object to simulate an individual player in the game.
     */
    public Player(int playerNumber)
    {
        // The player's ID number or turn order designation.
        this.playerNumber = playerNumber;
        // The player starts at level 1 initially.
        level = 1;
        // No combat bonuses until the player equips something or is modified by a usable once card.
        combatBonus = 0;
        // No run away bonuses until the player equips something.
        runAwayBonus = 0;
        goldAmount = 0;
        // Displays the player's hand, aka their available cards.
        hand = new ArrayList<>();
        // Limits the players card hand to only 5 (unless Dwarf is equipted).
        handLimit = 5;
        // The card's the player has placed down in front of them (equipment, curses placed on them, etc.).
        inPlayCards = new ArrayList<>();
    }
    
    //----------------------------------------------------
	//          METHOD(S)
    //----------------------------------------------------
    
    /**
     * Get the player's level.
     * @return The player's level.
     */ 
    public int getLevel() {
        return level;
    }

    /**
     * Get the player's combat bonus (from equipment and other cards).
     * @return The players combat bonus (from equipment and other cards).
     */ 
    public int getCombatBonus() {
        return combatBonus;
    }
    
    /**
     * Get the player's run away bonus (from equipment).
     * @return The player's run away bonus (from equipment).
     */ 
    public int getRunAwayBonus() {
        return runAwayBonus;
    }

    /**
     * Get the player's current gold amount.    
     * @return The player's current gold amount.
     */
    public int getGoldAmount() {
        return goldAmount;
    }

    /**
     * Increases the player's hand limit to 6 (dwarf card equipped).
     */
    public void increaseLimit_BecomeDwarf() {
        handLimit = 6;
    }
    
    /**
     * Resets the player's hand to the original limit of 5 (dwarf card discarded from equipped).
     */
    public void resetLimit_NoLongerDwarf() {
        handLimit = 5;
    }

    
    public Card getCardFromHand(int cardNumber) {
        int index = cardNumber - 1;
        return hand.get(index);
    }

    public void addCardToHand(Card newCard) {
        hand.add(newCard);
    }

    public void removeCardFromHand(int cardNumber) {
        int index = cardNumber - 1;
        Card cardToBeRemoved = hand.get(index);
        hand.remove(index);
        return cardToBeRemoved;
    }

    public Card getCardFromInPlayCards(int cardNumber) {
        int index = cardNumber - 1;
        return inPlayCards.get(index);
    }

    public void addCardToInPlayCards(Card newCard) {
        inPlaycards.add(newCard);
    }

    public void removeCardFromInPlayCards(int cardNumber) {
        int index = cardNumber - 1;
        Card cardToBeRemoved = inPlayCards.get(index);
        inPlayCards.remove(index);
        return cardToBeRemoved;
    }


    public void printHand() {
        System.out.println("");
        for (Card curCard : hand)
            System.out.println(curCard.getName());
    }

}
