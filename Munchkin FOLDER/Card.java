public class Card {
	// INSTANCE VARIABLES
	private String name;
	private String type; // "door" or "treasure"
	private String subtype;

	// CONSTRUCTOR(S)
    public Card(String name, String type, String subtype){
		this.name = name;
		this.type = type;
		this.subtype = subtype;
	}
	System.out.print("Hey");
    
	// METHOD(S)
	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
	public String getSubtype()
	{
		return subtype;
	}
}
