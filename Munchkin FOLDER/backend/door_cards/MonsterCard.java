package door_cards;

import basic_game_components.Card;

/**
 * This class represents a monster card in the game of Munchkin.
 */
public class MonsterCard extends Card {

	//----------------------------------------------------
	//			INSTANCE VARIABLES
	//----------------------------------------------------

	// The monster's level.
	private int level;
	// The monster's base treasure reward amount for defeating it (before any modifications).
	private int treasureReward;
	// The amount of levels you go up for defeating the monster.
	private int levelReward;
	// Whether or not the monster is undead.
	private boolean isUndead;

	//----------------------------------------------------
	//			CONSTRUCTOR(S)
	//----------------------------------------------------
	
	/**
	 * This method constructs a monster card in the game.
	 * @param name The unique name of the card.
	 * @param level The monster's base level.
	 * @param treasureReward The amount of treasures you are rewarded with for beating the monster.
	 * @param levelReward The amount of levels you are rewarded with for beating the monster.
	 * @param isUndead Whether or not the monster is undead (true if undead, false if not undead).
	 */
	public MonsterCard(String name, int level, int treasureReward, int levelReward, boolean isUndead) {
		super(name, "door");
        this.level = level;
        this.treasureReward = treasureReward;
		this.levelReward = levelReward;
		this.isUndead = isUndead;
	}
	//----------------------------------------------------
	//			METHOD(S)
	//----------------------------------------------------

	/**
	 * This method get the monster's current level.
	 * @return The monster's level.
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * This method get the monster's current treasure reward (i.e. the amount of treasures you get for beating it).
	 * @return The monster's current treasure reward.
	 */
	public int getTreasureReward() {
		return treasureReward;
	}
	
	/**
	 * This method gets the monster's current rewarded level increase (i.e. how many levels you gain for beating it).
	 * @return The monster's current rewarded level increase.
	 */
	public int getLevelReward() {
		return levelReward;
	}
	
	/**
	 * This method changes the monster's level based on a level modification amount (for when the monster's level is reduced or augmented by 
	 * another card). It can be a positive amount (increase) or negative amount (decrease).
	 * @param amount The level modification amount.
	 */
	public void modifyLevel(int levelModValue) {
		level += levelModValue;
	}

	/**
	 * This method changes the monster's treasure reward based on a treasure modification amount (for when the monster's treasure reward is
	 * reduced or augmented by another card).
	 * @param amount The amount by which it changes.
	 */
	public void modifyTreasureReward(int treasureModValue) {
		treasureReward += treasureModValue;
	}

	/**
	 * This method returns whether the monster is undead or not.
	 * @return True if undead, false if not undead.
	 */
	public boolean getUndeadStatus() {
		return isUndead;
	}

	/**
	 * This method is used to set the monster to undead, or set it to not undead.
	 * @param isUndead True to set the monster to undead, false to set the monster to not undead.
	 */
	public void setIfMonsterIsUndead(boolean isUndead) {
		this.isUndead = isUndead;
	}

} // End of MonsterCard class.