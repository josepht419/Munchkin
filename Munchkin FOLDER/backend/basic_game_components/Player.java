package basic_game_components;

import java.util.ArrayList;
import java.util.List;

/**
 * This class simulates a player in the game of Munchkin.
 */
public class Player {
    //----------------------------------------------------
	//          INSTANCE VARIABLES
    //----------------------------------------------------

    // The player's ID number or turn order designation.
    private int playerNumber;
    // The player's base level.
    private int level;

    private String sex;

    // The player's combat bonuses from equipment and modifier cards like potions, etc.
    private int combatBonus;
    // The player's run away bonus from equipment.
    private int runAwayBonus;
    // The player's current gold amount.
    private int goldAmount;
    // The player's hand, simulated by an ArrayList of Card objects.
    private List<Card> hand;
    // The player's hand limit, i.e. the max cards they can have in their hand before they end their turn.
    private int handLimit;
    // The cards the player has in play (ex: equipment, curses casted on the player, etc.).
    private List<Card> inPlayCards;

    private List<String> currentRaces;

    private List<String> currentClasses;

    private int weaponHandsOccupied;

    private boolean headgearOccupiedStatus;

    private boolean armorOccupiedStatus;

    private boolean footgearOccupiedStatus;

    private boolean atLeastOneBigItemStatus;

    //----------------------------------------------------
	//          CONSTRUCTOR(S)
    //----------------------------------------------------

    /**
     * This method constructs a Player object to simulate an individual player in the game.
     */
    public Player(int playerNumber, String sex)
    {
        // The player's ID number or turn order designation.
        this.playerNumber = playerNumber;

        this.sex = sex;

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

        currentRaces = new ArrayList<String>();
        currentRaces.add("human");

        currentClasses = new ArrayList<String>();

        weaponHandsOccupied = 0;
        headgearOccupiedStatus = false;
        footgearOccupiedStatus = false;
        atLeastOneBigItemStatus = false;
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

    public String getSex() {
        return sex;
    }

    public void changeSex() {
        if(sex.equals("male"))
            sex = "female";
        else if (sex.equals("female"))
            sex = "male";
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

    /**
     * This method gets a specific card from the player's hand based on a number (ex: the first card starting from the left is 
    card number 1, etc.).
     * @param cardNumber The card number (starting at 1 from the left).
     * @return The card in question.
     */
    public Card getCardFromHand(int cardNumber) {
        int index = cardNumber - 1;
        return hand.get(index);
    }
    
    /**
     * This method is used to add a new card to the player's hand.
     * @param newCard The new card being added to the player's hand.
     */
    public void addCardToHand(Card newCard) {
        hand.add(newCard);
    }
    
    /**
     * This method is used to remove a card from the player's hand based on a number (ex: the first card starting from the left is 
    card number 1, etc.).
     * @param cardNumber The card number (starting at 1 from the left).
     */
    public Card removeCardFromHand(int cardNumber) {
        int index = cardNumber - 1;
        Card cardToBeRemoved = hand.get(index);
        hand.remove(index);
        return cardToBeRemoved;
    }

    /**
     * This method gets the player's current hand limit.
     * @return The player's current hand limit.
     */
    public int getHandLimit() {
        return handLimit;
    }
    
    /**
     * This method gets a specific card from the player's in play cards based on a number (ex: the first card starting from the left is 
       card number 1, etc.).
     * @param cardNumber The card number (starting at 1 from the left).
     * @return The card in question.
     */
    
    public Card getCardFromInPlayCards(int cardNumber) {
        int index = cardNumber - 1;
        return inPlayCards.get(index);
    }

    /** This method adds a new card to player's in play cards.
     * @param newCard The new card being added to the player's in play cards.
     */
    public void addCardToInPlayCards(Card newCard) {
        inPlayCards.add(newCard);
    }
    
    /**
     * This method is used to remove a card from the player's in play cards based on a number (ex: the first card starting from the left is 
       card number 1, etc.).
     * @param cardNumber The card number (starting at 1 from the left).
     */
    
    public Card removeCardFromInPlayCards(int cardNumber) {
        int index = cardNumber - 1;
        Card cardToBeRemoved = inPlayCards.get(index);
        inPlayCards.remove(index);
        return cardToBeRemoved;
    }

    /**
     * This method prints the player's hand (i.e. the names of the cards in the player's hand in order from left to right.).
     */
    public void printHand() {
        System.out.println("----------- Player " + playerNumber + "'s Hand --------------");
        for (Card curCard : hand)
            System.out.println(curCard.getName());
        System.out.println("------------------------------------------");      
    }

    /**
     * This method prints the player's in play cards (i.e. the names of the cards in the player's in play cards in order from left to right.).
     */
    public void printInPlayCards() {
        System.out.println("----------- Player " + playerNumber + "'s InPlayCards -------");
        for (Card curCard : inPlayCards)
            System.out.println(curCard.getName());
        System.out.println("------------------------------------------");
    }

    public List<String> getCurrentRaces() {
        return currentRaces;
    }

    public void changeRace(String raceToBeChanged, String newRace) {
        currentRaces.clear();
        currentRaces.add(newRace);
    }

    public void loseRace() {
        currentRaces.clear();
        currentRaces.add("human");
    }

    public List<String> getCurrentClass() {
        return currentClasses;
    }

    public void changeClass(String newClass) {
        currentClasses.clear();
        currentClasses.add(newClass);
    }

    public void loseClass() {
        currentClasses.clear();
    }

    public int getWeaponHandsOccupied() {
        return weaponHandsOccupied;
    }

    public void changeWeaponHandsOccupied(int newValue) {
        weaponHandsOccupied = newValue;
    }

    public boolean getHeadgearOccupiedStatus() {
        return headgearOccupiedStatus;
    }

    private void changeHeadgearOccupiedStatus() {
        headgearOccupiedStatus = !headgearOccupiedStatus;
    }

    public boolean getArmorOccupiedStatus() {
        return armorOccupiedStatus;
    }

    public void changeArmorOccupiedStatus() {
        armorOccupiedStatus = !armorOccupiedStatus;
    }

    public boolean getFootgearOccupiedStatus() {
        return footgearOccupiedStatus;
    }

    public void changeFootgearOccupiedStatus() {
        footgearOccupiedStatus = !footgearOccupiedStatus;
    }

    public boolean getAtLeastOneBigItemStatus() {
        return atLeastOneBigItemStatus;
    }

    public void changeAtLeastOneBigItemStatus() {
        atLeastOneBigItemStatus = !atLeastOneBigItemStatus;
    }

} // End of Player class.