package treasure_cards;

import basic_game_components.Card;

/**
 * This class represents a simple equippable card in the game of Munchkin.
 */
public class SimpleEquippableCard extends Card {
    
    //----------------------------------------------------
	//			INSTANCE VARIABLES
	//----------------------------------------------------

    // The classification of the equippable ("weapon", "headgear", "armor", "footgear", "other").
    private String classification;

    // The combat bonus the equippable provides to the player (if any).
    private int combatBonus;

    // Who the equippable is usable by (exs: "any", "dwarf only", "female only", "not thief", etc.).
    private String usableByRequirement;

    // If the equippable is a weapon, whether the weapon requires 1 hand or 2 hands (possible values, 1 or 2, or 0 if not weapon).
    private int handsRequirement;

    // A boolean. If true, the equippable is big. If false, the equippable is not big (i.e. small).
    private boolean bigStatus;
    
    // The gold value of the equippable.
    private int goldValue;

    //----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------

    /**
     * This method constructs an equippable card in the game.
     * @param name The unique name of the card.
     * @param classification The classification of the equippable ("weapon", "headgear", "armor", "footgear", "other").
     * @param combatBonus The combat bonus the card provides (if any).
     * @param usableByRequirement Who the weapon is usable by (exs: "any", "dwarf", "female").
     * @param handsRequirement Whether the weapon requires 1 hand or 2 hands (possible values, 1 or 2).
     * @param bigStatus A boolean. If true, the weapon is big. If false, the weapon is not big (i.e. small).
     * @param goldValue The gold value of the weapon.
     */
    public SimpleEquippableCard(String name, String classification, int combatBonus, String usableByRequirement, int handsRequirement, boolean bigStatus, int goldValue) {
        super(name, "treasure");
        this.classification = classification;
        this.combatBonus = combatBonus;
        this.usableByRequirement = usableByRequirement;
        this.handsRequirement = handsRequirement;
        this.bigStatus = bigStatus;
        this.goldValue = goldValue;
    }

    //----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

    /**
     * This method get's the equippable's classification ("weapon", "headgear", "armor", "footgear", "other").
     * @return The equippable's classification.
     */
    public String getClassification() {
        return classification;
    }

    /**
     * This method gets the combat bonus the weapon provides to the player (if any).
     * @return The combat bonus the weapon provides to the player.
     */
    public int getCombatBonus() {
        return combatBonus;
    }

    /**
     * This method gets the usable by requirement of the weapon (exs: "any", "dwarf", "female").
     * @return The usable by requirement of the weapon.
     */
    public String getUsableByRequirement() {
        return usableByRequirement;
    }

    /**
     * This method gets the hands requirement of the weapon (if the weapon requires 1 hand or 2 hands).
     * @return 1 (int) if 1 handed, 2 (int) if 2 handed.
     */
    public int getHandsRequirement() {
        return handsRequirement;
    }

    /**
     * This method gets the big status of the weapon.
     * @return True if the weapon is big, false if the weapon is not big (i.e. small).
     */
    public boolean getBigStatus() {
        return bigStatus;
    }

    /**
     * The method gets the gold value of the weapon.
     * @return The gold value of the weapon.
     */
    public int getGoldValue() {
        return goldValue;
    }

} // End of Weapon class.