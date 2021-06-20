package door_cards;

import basic_game_components.Card;

/**
 * This class represents a monster card in the game of Munchkin.
 */
public class MonsterCard extends Card {

	//----------------------------------------------------
	//			INSTANCE VARIABLES
	//----------------------------------------------------

	// The monster's base level (before any modifications).
	private int baseLevel;
	// The monster's modified level (after any modifications).
	private int modifiedLevel;
	// The monster's base treasure reward amount for defeating it (before any modifications).
	private int baseTreasureAmount;
	// The monster's modified treasure reward amount for defeating it (after any modifications).
	private int modifiedTreasureAmount;
	// The amount of levels you go up for defeating the monster.
	private int levelIncrease;
	// Whether or not the monster is undead.
	private boolean undeadStatus;

	//----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------
	
	/**
	 * This method constructs a monster card in the game.
	 * @param name The unique name of the card.
	 * @param level The monster's base level.
	 * @param treasureAmount The amount of treasures you get for beating the monster.
	 * @param levelIncrease The amount of levels you go up for beating the monster.
	 */
	public MonsterCard(String name, int level, int treasureAmount, int levelIncrease, boolean undeadStatus){
		super(name, "door");
        baseLevel = level;
		modifiedLevel = baseLevel;
        baseTreasureAmount = treasureAmount;
		modifiedTreasureAmount = baseTreasureAmount;
		this.levelIncrease = levelIncrease;
		this.undeadStatus = undeadStatus;
	}
	//----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

	/**
	 * Get the monster's level.
	 * @return The monster's level.
	 */
	public int getLevel() {
		return modifiedLevel;
	}
	/**
	 * Get the monster's treasure amount (i.e. the amount of treasures you get for beating it).
	 * @return The monster's treasure amount.
	 */
	public int getTreasureAmount() {
		return baseTreasureAmount;
	}
	
	/**
	 * Get the monster's level increase (i.e. how many levels you gain for beating it).
	 * @return
	 */
	public int getLevelIncrease() {
		return levelIncrease;
	}
	
	
	/**
	 * Changes the monsters level based on an amount from a different card.
	 * @param amount The amount by which it changes.
	 */
	public void modifyLevel(int levelModValue) {
		modifiedLevel = modifiedLevel + levelModValue;
	}

	/** 
	 * Resets the monster's level to its original state.
	 */
	public void resetLevel() {
		modifiedLevel = baseLevel;
	}


	/**
	 * Changes the monster's treasure amount based on an amount from a different card.
	 * @param amount The amount by which it changes.
	 */
	public void modifyTreasureAmount(int treasureModValue) {
		modifiedTreasureAmount = modifiedTreasureAmount + treasureModValue;
	}

	/** 
	 * Resets the monster's treasure amount to its original state.
	 */
	public void resetTreasureAmount() {
		modifiedTreasureAmount = baseTreasureAmount;
	}

	public boolean getUndeadStatus() {
		return undeadStatus;
	}

} // End of Monster class.