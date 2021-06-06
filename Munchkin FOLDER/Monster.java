public class Monster extends Card {
	// INSTANCE VARIABLES
	private int baseLevel;
	private int modifiedLevel;
	private int baseTreasureAmount;
	private int modifiedTreasureAmount;
	private int levelIncrease;

	//----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------
	
	public Monster(String name, int level, int treasureAmount, int levelIncrease){
		super(name, "door", "monster");
        baseLevel = level;
		modifiedLevel = baseLevel;
        baseTreasureAmount = treasureAmount;
		modifiedTreasureAmount = baseTreasureAmount;
		this.levelIncrease = levelIncrease;
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
	public void modifyLevel(int amount) {
		modifiedLevel = modifiedLevel + amount;
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
	public void modifyTreasureAmount(int amount) {
		modifiedTreasureAmount = modifiedTreasureAmount + amount;
	}

	/** 
	 * Resets the monster's treasure amount to its original state.
	 */
	public void resetTreasureAmount() {
		modifiedTreasureAmount = baseTreasureAmount;
	}

}