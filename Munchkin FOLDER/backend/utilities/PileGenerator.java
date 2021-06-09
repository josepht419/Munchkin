package utilities;

import basic_game_components.*;
import door_cards.*;
import treasure_cards.*;

public class PileGenerator {
    
    private List<Card> doorPile;
    private List<Card> treasurePile;

    public PileGenerator() {
        this.name = name;
        this.type = type;
    }

    public void instantiateDoorPile() {

        // ClassCard(String name)
        ClassCard class1 = new ClassCard("Cleric");
        ClassCard class2 = new ClassCard("Cleric");
        ClassCard class3 = new ClassCard("Cleric");
        ClassCard class4 = new ClassCard("Warrior");
        ClassCard class5 = new ClassCard("Warrior");
        ClassCard class6 = new ClassCard("Warrior");
        ClassCard class7 = new ClassCard("Thief");
        ClassCard class8 = new ClassCard("Thief");
        ClassCard class9 = new ClassCard("Thief");
        ClassCard class10 = new ClassCard("Wizard");
        ClassCard class11 = new ClassCard("Wizard");
        ClassCard class12 = new ClassCard("Wizard");

        // CurseCard(String name)
        CurseCard curse1 = new CurseCard("Curse! Lose A Level");
        CurseCard curse2 = new CurseCard("Curse! Lose A Level");
        CurseCard curse3 = new CurseCard("Curse! Lose A Small Item");
        CurseCard curse4 = new CurseCard("Curse! Lose The Armor You Are Wearing");
        CurseCard curse5 = new CurseCard("Curse! Lose The Footgear You Are Wearing");
        CurseCard curse6 = new CurseCard("Curse! Lose The Headgear You Are Wearing");
        CurseCard curse7 = new CurseCard("Curse! Lose Two Cards");
        CurseCard curse8 = new CurseCard("Curse! Lose Your Class");

        // MonsterCard(String name, int level, int treasureAmount, int levelIncrease)
        MonsterCard monster1 = new MonsterCard("3,872 Orcs", 10, 3, 1);
        MonsterCard monster2 = new MonsterCard("Amazon", 8, 2, 1);
        MonsterCard monster3 = new MonsterCard("Bigfoot", 12, 3, 1);
        MonsterCard monster4 = new MonsterCard("Bullrog", 18, 5, 2);
        MonsterCard monster5 = new MonsterCard("Floating Nose", 10, 3, 1);
        MonsterCard monster6 = new MonsterCard("Gazebo", 8, 2, 1);
        MonsterCard monster7 = new MonsterCard("Net Troll", 10, 3, 1);
        MonsterCard monster8 = new MonsterCard("Face Sucker", 8, 2, 1);
        MonsterCard monster9 = new MonsterCard("Gelatinous Octahedron", 2, 1, 1);
        MonsterCard monster10 = new MonsterCard("GhoulFiends", 8, 2, 1);
        MonsterCard monster11 = new MonsterCard("Insurance Salesman", 14, 4, 1);
        MonsterCard monster12 = new MonsterCard("Maul Rat", 1, 1, 1);
        MonsterCard monster13 = new MonsterCard("Leperchaun", 4, 2, 5);
        MonsterCard monster14 = new MonsterCard("Lame Goblin", 1, 1, 1);
        MonsterCard monster15 = new MonsterCard("Large Angry Chicken", 2, 1, 1);
        MonsterCard monster16 = new MonsterCard("King Tut", 16, 4, 2);
        MonsterCard monster17 = new MonsterCard("Lawyers", 6, 2, 1);
        MonsterCard monster18 = new MonsterCard("Pit Bull", 2, 1, 1);
        MonsterCard monster19 = new MonsterCard("Mr. Bones", 2, 1, 1);
        MonsterCard monster20 = new MonsterCard("Flying Frogs", 2, 1, 1);
        MonsterCard monster21 = new MonsterCard("PlatyCore", 6, 2, 1);
        MonsterCard monster22 = new MonsterCard("Pukachu", 6, 2, 1);
        MonsterCard monster23 = new MonsterCard("Shrieking Geek", 6, 2, 1);
        MonsterCard monster24 = new MonsterCard("Plutononium Dragon", 20, 5, 2);
        MonsterCard monster25 = new MonsterCard("Potted Plant", 1, 1, 1);
        MonsterCard monster26 = new MonsterCard("Undead Horse", 4, 2, 1);
        MonsterCard monster27 = new MonsterCard("Wannabe Vampire", 12, 3, 1);
        MonsterCard monster28 = new MonsterCard("Unspeakably Awful Indescribable Horror", 14, 4, 1);
        MonsterCard monster29 = new MonsterCard("Wight Brothers", 16, 4, 2);
        MonsterCard monster30 = new MonsterCard("Harpies", 4, 2, 1);
        MonsterCard monster31 = new MonsterCard("Hippogriff", 16, 4, 2);
        
        // MonsterModifierCard(String name, int levelModValue, int treasureModValue)
        MonsterModifierCard monsterModifier1 = new MonsterModifierCard("Ancient", 10, 2);
        MonsterModifierCard monsterModifier2 = new MonsterModifierCard("Baby", -5, -1);
        MonsterModifierCard monsterModifier3 = new MonsterModifierCard("Enraged", 5, 1);
        MonsterModifierCard monsterModifier4 = new MonsterModifierCard("Humongous", 10, 2);
        MonsterModifierCard monsterModifier5 = new MonsterModifierCard("Intelligent", 5, 1);
        
        // RaceCard(String name)
        RaceCard race1 = new RaceCard("Elf");
        RaceCard race2 = new RaceCard("Elf");
        RaceCard race3 = new RaceCard("Elf");
        RaceCard race4 = new RaceCard("Halfling");
        RaceCard race5 = new RaceCard("Halfling");
        RaceCard race6 = new RaceCard("Halfling");
        RaceCard race7 = new RaceCard("Dwarf");
        RaceCard race8 = new RaceCard("Dwarf");
        RaceCard race9 = new RaceCard("Dwarf");

        // SpecialDoorCard(String name)
        SpecialDoorCard specialDoor1 = new SpecialDoorCard("Cheat!");
        SpecialDoorCard specialDoor2 = new SpecialDoorCard("Help Me Out Here!");
        SpecialDoorCard specialDoor3 = new SpecialDoorCard("Illusion");
        SpecialDoorCard specialDoor4 = new SpecialDoorCard("Mate");
        SpecialDoorCard specialDoor5 = new SpecialDoorCard("Out To Lunch");
        SpecialDoorCard specialDoor6 = new SpecialDoorCard("Wandering Monster");
        SpecialDoorCard specialDoor7 = new SpecialDoorCard("Wandering Monster");

    } // End of instantiateDoorPile

    public void instantiateTreasurePile() {

        // GUALCard(String name)
        GUALCard gual1 = new GUALCard("1,000 Gold Pieces");
        GUALCard gual2 = new GUALCard("Boil An Anthill");
        GUALCard gual3 = new GUALCard("Bribe GM With Food");
        GUALCard gual4 = new GUALCard("Convenient Addition Error");
        GUAlCard gual5 = new GUALCard("Invoke Obscure Rules");
        GUAlCard gual6 = new GUALCard("Kill The Hireling");
        GUAlCard gual7 = new GUALCard("Mutilate The Bodies");
        GUAlCard gual8 = new GUALCard("Potion Of General Studliness");
        GUAlCard gual9 = new GUALCard("Whine At The GM");
        
        // SimpleEquippableCard(String name, String classification, int combatBonus, String usableByRequirement, int handsRequirement, boolean bigStatus, int goldValue)
        SimpleEquippableCard simpleEquippable1 = new SimpleEquippableCard("Bad-Ass Bandana", "headgear", 3, "human only", 0, false, 400);
            
        // SimpleUsableOnceCard(String name, int combatBonus)


        // SpecialTreasureCard(String name)


    } // End of instatiateTreasurePile.

    
    
} // End of PileGenerator class.
