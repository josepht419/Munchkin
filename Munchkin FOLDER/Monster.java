public class Monster extends Card {
	// INSTANCE VARIABLES
	private int baseLevel;
	private int modifiedLevel;
	private int treasureAmount;

	//----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------
	
	public Monster(String name, int level, int treasureAmount){
		super(name, "door", "monster");
        this.level = level;
        this.treasureAmount = treasureAmount;
		this.levelIncrease = levelIncrease;
	}
	//----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

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
	
}