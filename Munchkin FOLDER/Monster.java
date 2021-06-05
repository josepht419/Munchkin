public class Monster extends Card {
	// INSTANCE VARIABLES
	private int level;
	private int treasureAmount;

	// CONSTRUCTOR(S)
	public Monster(String name, int level, int treasureAmount){
		this.name = name;
		type = "door";
		subtype = "monster";
        this.level = level;
        this.treasureAmount = treasureAmount;
	}
	// METHOD(S)
	public String getName(){
		return name;
		dcf
	}
}