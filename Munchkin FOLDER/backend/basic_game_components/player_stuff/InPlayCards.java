package basic_game_components.player_stuff;

import basic_game_components.Card;
import java.util.List;
import java.util.ArrayList;

/**
 * This class simulates the player's in play cards, i.e. the card they have layed out infront of them (ex: equipment, active curses, 
 * helpers, etc.).
 */
public class InPlayCards {
    //----------------------------------------------------
    //          INSTANCE VARIABLES
    //----------------------------------------------------

    // The ID number or turn order designation of the player whose in play cards these are.
    private int playerNumber;
    // A list of Card objects to simulate the in play cards.
    private List<Card> inPlayCardsList;
    // The current number of race cards the player has equipped.
    private int numOfEquippedRaces;
    // The number of races cards a player can have equipped simultaneously (normally 1, 2 with "Half-Breed" card.)
    private int raceCardLimit;
    // Whether or not the player is a human or part-human.
    private boolean isHuman;
    // The current number of class cards the player has equipped.
    private int numOfEquippedClasses;
    // The number of class cards a player can have equipped simultaneously (normally 1, 2 with "Super Munchkin" card.)
    private int classCardLimit;
    // The number of weapon hands the player has occupied. Value is 1 if the player only has a one-handed weapon, 2 if the player has either
    // a two-handed weapon or 2 one-handed weapons, or 0 if the player has no weapons.
    private int numOfWeaponHandsOccupied;
    // Whether or not the player has headgear equipped.
    private boolean headgearEquipped;
    // Whether or not the player has armor equipped.
    private boolean armorEquipped;
    // Whether or not the player has footgear equipped.
    private boolean footgearEquipped;
    // Whether or not the player has at least one big item equipped.
    private boolean atLeastOneBigItem_Equipped;


    //----------------------------------------------------
    //            CONSTRUCTOR(S)
    //----------------------------------------------------

    /**
     * This method constructs an InPlayCards object for the Player class.
     * @param playerNumber The ID number or turn order designation of the player whose in play cards these are.
     */
    public InPlayCards(int playerNumber) {
        this.playerNumber = playerNumber;
        inPlayCardsList = new ArrayList<>();

        numOfEquippedRaces = 0;
        raceCardLimit = 1;
        isHuman = true;
        numOfEquippedClasses = 0;
        classCardLimit = 1;
        numOfWeaponHandsOccupied = 0;
        headgearEquipped = false;
        armorEquipped = false;
        footgearEquipped = false;
        atLeastOneBigItem_Equipped = false;

    } // End of constructor method.

    //----------------------------------------------------
    //          METHOD(S)
    //----------------------------------------------------

    //------------------------------------------
    //     DEALING WITH RACE CARDS...
    //------------------------------------------


    /**
     * This method gets the number of races currently equipped.
     * @return The number of races currently equipped.
     */
    public int getNumberOfEquippedRaces() {
        return numOfEquippedRaces;
    }

    /**
     * This method gets the current race card limit (usually 1, 2 if the "Half-Breed" card is equipped).
     * @return The current race card limit.
     */
    public int getRaceCardLimit() {
        return raceCardLimit;
    }

    /**
     * This method is used to increase the race card limit to 2 if the player equips the "Half-Breed" card.
     */
    public void extendRaceCardLimit_HalfBreedEquipped() {
        raceCardLimit = 2;
    }

    /**
     * This method is used to reset the race card limit to 1 if the player loses "Half-Breed" card.
     */
    public void resetRaceCardLimit_HalfBreedRemoved() {
        raceCardLimit = 1;
    }

    /**
     * This method checks to see if a race card can be equipped according to the current number of race cards equipped versus the limit.
     * @return True if race card can be equipped, false if it cannot.
     */
    public boolean checkIf_RaceCardCanBeEquipped() {
        return numOfEquippedRaces < raceCardLimit;
    }

    /**
     * This method is used to increment the number of equipped races when a race card is equipped.
     */
    public void incrementNumberOfEquippedRaces() {
        numOfEquippedRaces++;
    }

    /**
     * This method is used to decrement the number of equipped races when a race card is removed.
     */
    public void decrementNumberOfEquippedRaces() {
        numOfEquippedRaces--;
    }

    /**
     * This method is used to reset the number of equipped races when the player is a victim of the "Curse! Lose Your Race".
     */
    public void resetNumOfEquippedRaces_LoseYourRace() {
        numOfEquippedRaces = 0;
    }

    //------------------------------------------
    // End of dealing with race cards methods.
    //------------------------------------------

    //------------------------------------------
    //     DEALING WITH CLASS CARDS...
    //------------------------------------------

    /**
     * This method gets the number of classes currently equipped.
     * @return The number of classes currently equipped.
     */
    public int getNumberOfEquippedClasses() {
        return numOfEquippedRaces;
    }


    public int getClassCardLimit() {
        return classCardLimit;
    }

    /**
     * This method is used to increase the race card limit to 2 if the player equips the "Half-Breed" card.
     */
    public void extendClassCardLimit_SuperMunchkinEquipped() {
        classCardLimit = 2;
    }

    /**
     * This method is used to reset the race card limit to 1 if the player loses "Half-Breed" card.
     */
    public void resetClassCardLimit_SuperMunchkinRemoved() {
        classCardLimit = 1;
    }

    public boolean checkIf_ClassCardCanBeEquipped() {
        return numOfEquippedClasses < classCardLimit;
    }


    public void increment_NumberOfEquippedClasses() {
        numOfEquippedClasses++;
    }

    /**
     * This method is used to decrement the number of equipped classes when a class card is removed.
     */
    public void decrementNumberOfEquippedClasses() {
        numOfEquippedRaces--;
    }

    public void resetNumOfEquippedClasses_ToZero() {
        numOfEquippedClasses = 0;
    }

    //------------------------------------------
    // End of dealing with class cards methods.
    //------------------------------------------

    //------------------------------------------
    //     DEALING WITH ITEM CARDS...
    //------------------------------------------

    public boolean checkIf_HeadgearEquipped() {
        return headgearEquipped;
    }

    public boolean checkIf_ArmorEquipped() {
        return armorEquipped;
    }

    public boolean checkIf_FootgearEquipped() {
        return footgearEquipped;
    }

    public boolean checkIf_atLeastOneBigItem_Equipped() {
        return atLeastOneBigItem_Equipped;
    }

    //------------------------------------------
    // End of dealing with item cards methods.
    //------------------------------------------

    /**
     * This method gets a card from the player's in play cards based on it's card location number (ex: the first card starting from the 
     * left is card 1, etc.). Assume that the cards are all lined up in a straight line, or assume that we start from the first row of
     * cards, finish it, and then go to the next row of cards, starting from the leftmost again, so on and so forth.
     * @param cardNumber The card number (starting at 1 from the left).
     * @return The card in question.
     */
    public Card getCard_UsingCardLocationNumber(int cardLocationNumber) {
        int index = cardLocationNumber - 1;
        return inPlayCardsList.get(index);
    }

    /**
     * This method adds a new card to the player's in play cards.
     * @param newCard The new card in question.
     */
    public void addCardToInPlayCards(Card newCard) {
        inPlayCardsList.add(newCard);
    }

    /**
     * This method searches for a card using its name. If it is found, the card location number is returned. If it is not found, 
     * return 0 (default).
     * @param searchedCardName The card's name.
     * @return The card's location number, if found. If not found, return 0, indicating it was not found in the in play cards.
     */
    public int searchForCardUsingName_ReturnCardLocationNumber(String searchedCardName) {

        for(int i = 0; i < inPlayCardsList.size(); i++) {

            Card curCard = inPlayCardsList.get(i);
            String curCardName = curCard.getName();

            if(curCardName.equals(searchedCardName)) {
                // The card location number is the index location plus 1, because we start counting from 1 for card location numbers.
                return i + 1;
            }

        } // End of for loop.

        // If it was never found in the for loop above, we return 0 by default, indicating that it was not found in the in play cards.
        return 0;

    } // End of searchForCardUsingName_ReturnCardLocationNumber method.

    /**
     * This method searches for a card using its type. If it is found, the card location number is returned. If it is not found, 
     * return 0 (default).
     * @param cardType The card's type.
     * @return The card's location number, if found. If not found, return 0, indicating it was not found in the in play cards.
     */
    public int searchForCardUsingType_ReturnCardLocationNumber(String searchedCardType) {

        for(int i = 0; i < inPlayCardsList.size(); i++) {

            Card curCard = inPlayCardsList.get(i);
            String curCardType = curCard.getType();

            if(curCardType == searchedCardType) {
                // The card location number is the index location plus 1, because we start counting from 1 for card location numbers.
                return i + 1; 
            }

        } // End of for loop.

        // If it was never found in the for loop above, we return 0 by default, indicating that it was not found in the in play cards.
        return 0;

    } // End of searchForCardUsingType_ReturnCardLocationNumber method.

    /**
     * This method removes a card from the player's in play cards using its card location number (the leftmost card is 1, followed by 2, 3, etc.).
     * It also returns it (used to move it somewhere else).
     * @param cardLocationNumber The card location number (the leftmost card is 1, followed by 2, 3, etc.).
     * @return The card removed.
     */
    public Card removeCard_UsingCardLocationNumber(int cardLocationNumber) {
        int index = cardLocationNumber - 1;
        return inPlayCardsList.remove(index);
    }

    /**
     * This is an overrided toString method to provide a visual representation of the player's in play cards when printing to the console.
     * It display's the player's turn designation number and the names of all the cards in his in play. This is used for development
     * and testing.
     */
    public String toString() {

        String output = "------ Player " + playerNumber + "'s In Play Cards ----------\n";

        for(Card curCard : inPlayCardsList) {
            String curCardName = curCard.getName();
            output += curCardName + "\n";
        }

        output += "------------------------------------------";

        return output;

    } // End of toString method.

} // End of Hand class.