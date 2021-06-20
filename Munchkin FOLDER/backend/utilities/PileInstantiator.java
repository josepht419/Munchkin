package utilities;

import java.util.List;
import java.util.ArrayList;

import basic_game_components.*;
import door_cards.*;
import treasure_cards.*;

public class PileInstantiator {
    
    private List<Card> doorPile;
    private List<Card> treasurePile;

    private List<Card> doorPile_Backup;
    private List<Card> treasurePile_Backup;

    public PileInstantiator() {
        // Create empty arrays for both piles.
        doorPile = new ArrayList<Card>();
        treasurePile = new ArrayList<Card>();

        doorPile_Backup = new ArrayList<Card>();
        treasurePile_Backup = new ArrayList<Card>();

        // Instantiate both piles with their respective cards.
        instantiateDoorPile();
        instantiateTreasurePile();
        
    }

    public void instantiateDoorPile() {

        // Create all the cards in the door pile of the original game.

        Card card01 = new MonsterCard("3,872 Orcs", 10, 3, 1, false);
        Card card02 = new MonsterCard("Amazon", 8, 2, 1, false);
        Card card03 = new MonsterEnhancerCard("Ancient", 10, 2);
        Card card04 = new MonsterEnhancerCard("Baby", -5, -1);
        Card card05 = new MonsterCard("Bigfoot", 12, 3, 1, false);
        Card card06 = new MonsterCard("Bullrog", 18, 5, 2, false);
        Card card07 = new OtherDoorCard("Cheat!");
        Card card08 = new ClassCard("Cleric");
        Card card09 = new ClassCard("Cleric");
        Card card10 = new ClassCard("Cleric");
        Card card11 = new MonsterCard("Crabs", 1, 1, 1, false);
        Card card12 = new CurseCard("Curse! Change Class");
        Card card13 = new CurseCard("Curse! Change Race");
        Card card14 = new CurseCard("Curse! Change Sex");
        Card card15 = new CurseCard("Curse! Chicken On Your Head");
        Card card16 = new CurseCard("Curse! Duck Of Doom");
        Card card17 = new CurseCard("Curse! Income Tax");
        Card card18 = new CurseCard("Curse! Lose A Big Item");
        Card card19 = new CurseCard("Curse! Lose A Level");
        Card card20 = new CurseCard("Curse! Lose A Level");
        Card card21 = new CurseCard("Curse! Lose A Small Item");
        Card card22 = new CurseCard("Curse! Lose A Small Item");
        Card card23 = new CurseCard("Curse! Lose The Armor You Are Wearing");
        Card card24 = new CurseCard("Curse! Lose The Footgear You Are Wearing");
        Card card25 = new CurseCard("Curse! Lose The Headgear You Are Wearing");
        Card card26 = new CurseCard("Curse! Lose Two Cards");
        Card card27 = new CurseCard("Curse! Lose Your Class");
        Card card28 = new CurseCard("Curse! Lose Your Race");
        Card card29 = new CurseCard("Curse! Malign Mirror");
        Card card30 = new OtherDoorCard("Divine Intervention");
        Card card31 = new MonsterCard("Drooling Slime", 1, 1, 1, false);
        Card card32 = new RaceCard("Dwarf");
        Card card33 = new RaceCard("Dwarf");
        Card card34 = new RaceCard("Dwarf");
        Card card35 = new RaceCard("Elf");
        Card card36 = new RaceCard("Elf");
        Card card37 = new RaceCard("Elf");
        Card card38 = new MonsterEnhancerCard("Enraged", 5, 1);
        Card card39 = new MonsterCard("Face Sucker", 8, 2, 1, false);
        Card card40= new MonsterCard("Floating Nose", 10, 3, 1, false);
        Card card41 = new MonsterCard("Flying Frogs", 2, 1, 1, false);
        Card card42 = new MonsterCard("Gazebo", 8, 2, 1, false);
        Card card43 = new MonsterCard("Gelatinous Octahedron", 2, 1, 1, false);
        Card card44 = new MonsterCard("Ghoulfiends", 8, 2, 1, false);
        Card card45 = new OtherDoorCard("Half-Breed");
        Card card46 = new OtherDoorCard("Half-Breed");
        Card card47 = new RaceCard("Halfling");
        Card card48 = new RaceCard("Halfling");
        Card card49 = new RaceCard("Halfling");
        Card card50 = new MonsterCard("Harpies", 4, 2, 1, false);
        Card card51 = new OtherDoorCard("Help Me Out Here!");
        Card card52 = new MonsterCard("Hippogriff", 16, 4, 2, false);
        Card card53 = new MonsterEnhancerCard("Humongous", 10, 2);
        Card card54 = new OtherDoorCard("Illusion");
        Card card55 = new MonsterCard("Insurance Salesman", 14, 4, 1, false);
        Card card56 = new MonsterEnhancerCard("Intelligent", 5, 1);
        Card card57 = new MonsterCard("King Tut", 16, 4, 2, true);
        Card card58 = new MonsterCard("Lame Goblin", 1, 1, 1, false);
        Card card59 = new MonsterCard("Large Angry Chicken", 2, 1, 1, false);
        Card card60 = new MonsterCard("Lawyers", 6, 2, 1, false);
        Card card61 = new MonsterCard("Leperchaun", 4, 2, 5, false);
        Card card62 = new OtherDoorCard("Mate");
        Card card63 = new MonsterCard("Maul Rat", 1, 1, 1, false);
        Card card64 = new MonsterCard("Mr. Bones", 2, 1, 1, true);
        Card card65 = new MonsterCard("Net Troll", 10, 3, 1, false);
        Card card66 = new OtherDoorCard("Out To Lunch");
        Card card67 = new MonsterCard("Pit Bull", 2, 1, 1, false);
        Card card68 = new MonsterCard("Platycore", 6, 2, 1, false);
        Card card69 = new MonsterCard("Plutononium Dragon", 20, 5, 2, false);
        Card card70 = new MonsterCard("Potted Plant", 1, 1, 1, false);
        Card card71 = new MonsterCard("Pukachu", 6, 2, 1, false);
        Card card72 = new MonsterCard("Shrieking Geek", 6, 2, 1, false);
        Card card73 = new MonsterCard("Snails On Speed", 4, 2, 1, false);
        Card card74 = new MonsterCard("Squidzilla", 18, 4, 2, false);
        Card card75 = new MonsterCard("Stoned Golem", 14, 4, 1, false);
        Card card76 = new OtherDoorCard("Super Munchkin");
        Card card77 = new OtherDoorCard("Super Munchkin");
        Card card78 = new ClassCard("Thief");
        Card card79 = new ClassCard("Thief");
        Card card80 = new ClassCard("Thief");
        Card card81 = new MonsterCard("Tongue Demon", 12, 3, 1, false);
        Card card82 = new CurseCard("Truly Obnoxious Curse!");
        Card card83 = new MonsterCard("Undead Horse", 4, 2, 1, true);
        Card card84 = new MonsterCard("Unspeakable Awful Indescribable Horror", 14, 4, 1, false);
        Card card85 = new OtherDoorCard("Wandering Monster");
        Card card86 = new OtherDoorCard("Wandering Monster");
        Card card87 = new MonsterCard("Wannabe Vampire", 12, 3, 1, false);
        Card card88 = new ClassCard("Warrior");
        Card card89 = new ClassCard("Warrior");
        Card card90 = new ClassCard("Warrior");
        Card card91 = new MonsterCard("Wight Brothers", 16, 4, 2, true);
        Card card92 = new ClassCard("Wizard");
        Card card93 = new ClassCard("Wizard");
        Card card94 = new ClassCard("Wizard");

        // Add the cards to the door pile.
        doorPile.add(card01);
        doorPile.add(card02);
        doorPile.add(card03);
        doorPile.add(card04);
        doorPile.add(card05);
        doorPile.add(card06);
        doorPile.add(card07);
        doorPile.add(card08);
        doorPile.add(card09);
        doorPile.add(card10);
        doorPile.add(card11);
        doorPile.add(card12);
        doorPile.add(card13);
        doorPile.add(card14);
        doorPile.add(card15);
        doorPile.add(card16);
        doorPile.add(card17);
        doorPile.add(card18);
        doorPile.add(card19);
        doorPile.add(card20);
        doorPile.add(card21);
        doorPile.add(card22);
        doorPile.add(card23);
        doorPile.add(card24);
        doorPile.add(card25);
        doorPile.add(card26);
        doorPile.add(card27);
        doorPile.add(card28);
        doorPile.add(card29);
        doorPile.add(card30);
        doorPile.add(card31);
        doorPile.add(card32);
        doorPile.add(card33);
        doorPile.add(card34);
        doorPile.add(card35);
        doorPile.add(card36);
        doorPile.add(card37);
        doorPile.add(card38);
        doorPile.add(card39);
        doorPile.add(card40);
        doorPile.add(card41);
        doorPile.add(card42);
        doorPile.add(card43);
        doorPile.add(card44);
        doorPile.add(card45);
        doorPile.add(card46);
        doorPile.add(card47);
        doorPile.add(card48);
        doorPile.add(card49);
        doorPile.add(card50);
        doorPile.add(card51);
        doorPile.add(card52);
        doorPile.add(card53);
        doorPile.add(card54);
        doorPile.add(card55);
        doorPile.add(card56);
        doorPile.add(card57);
        doorPile.add(card58);
        doorPile.add(card59);
        doorPile.add(card60);
        doorPile.add(card61);
        doorPile.add(card62);
        doorPile.add(card63);
        doorPile.add(card64);
        doorPile.add(card65);
        doorPile.add(card66);
        doorPile.add(card67);
        doorPile.add(card68);
        doorPile.add(card69);
        doorPile.add(card70);
        doorPile.add(card71);
        doorPile.add(card72);
        doorPile.add(card73);
        doorPile.add(card74);
        doorPile.add(card65);
        doorPile.add(card66);
        doorPile.add(card67);
        doorPile.add(card68);
        doorPile.add(card69);
        doorPile.add(card70);
        doorPile.add(card71);
        doorPile.add(card72);
        doorPile.add(card73);
        doorPile.add(card74);
        doorPile.add(card75);
        doorPile.add(card76);
        doorPile.add(card77);
        doorPile.add(card78);
        doorPile.add(card79);
        doorPile.add(card80);
        doorPile.add(card81);
        doorPile.add(card82);
        doorPile.add(card83);
        doorPile.add(card84);
        doorPile.add(card85);
        doorPile.add(card86);
        doorPile.add(card87);
        doorPile.add(card88);
        doorPile.add(card89);
        doorPile.add(card90);
        doorPile.add(card91);
        doorPile.add(card92);
        doorPile.add(card93);
        doorPile.add(card94);

    } // End of instantiateDoorPile

    public void instantiateTreasurePile() {

        // Creating all the cards in the treasure pile of the original game.
        Card card01 = new GUALCard("1,000 Gold Pieces");
        Card card02 = new ItemCard("Bad-Ass Bandana", "headgear", 3, 0, "human only", 0, false, 400);
        Card card03 = new GUALCard("Boil An Anthill");
        Card card04 = new ItemCard("Boots of Butt-Kicking", "footgear", 2, 0, "any", 0, false, 400);
        Card card05 = new ItemCard("Boots of Running Really Fast", "footgear", 0, 2, "any", 0, false, 400);
        Card card06 = new ItemCard("Bow With Ribbons", "weapon", 4, 0, "elf only", 2, false, 800);
        Card card07 = new GUALCard("Bribe GM With Food");
        Card card08 = new ItemCard("Broad Sword", "weapon", 3, 0, "females only", 1, false, 400);
        Card card09 = new ItemCard("Buckler Of Swashing", "weapon", 2, 0, "any", 1, false, 400);
        Card card10 = new ItemCard("Chainsaw Of Bloody Dismemberment", "weapon", 3, 0, "any", 2, true, 600);
        Card card11 = new ItemCard("Cheese Grater of Peace", "weapon", 3, 0, "cleric only", 1, false, 400);
        Card card12 = new ItemCard("Cloak Of Obscurity", "other", 4, 0, "thief only", 0, false; 600);
        Card card13 = new GUALCard("Convenient Addition Error");
        Card card14 = new OneShotTreasureCard("Cotion Of Ponfusion", 3, 100, true);
        Card card15 = new ItemCard("Dagger Of Treachery", "weapon", 3, 0, "thief only", 1, false, 400);
        Card card16 = new OneShotTreasureCard("Doppleganger", 0, 300, false);
        Card card17 = new OneShotTreasureCard("Electric Radioactive Acid Potion", 5, 200, true);
        Card card18 = new ItemCard("Eleven-Foot Pole", "weapon", 1, 0, "any", 2, false, 200);
        Card card19 = new ItemCard("Flaming Armor", "armor", 2, 0 ,"any", 0, false, 400);
        Card card20 = new OneShotTreasureCard("Flaming Poison Potion", 3, 100, true);
        Card card21 = new OneShotTreasureCard("Flask Of Glue", 0, 100, false);
        Card card22 = new OneShotTreasureCard("Freezing Explosive Potion", 3, 100, true);
        Card card23 = new OneShotTreasureCard("Friendship Potion", 0, 200, false);
        Card card24 = new ItemCard("Gentleman's Club", "weapon", 3, 0, "males only", 1, false, 400);
        Card card26 = new ItemCard("Helm Of Courage", "headgear", 1, 0, "any", 0, false, 200);
        Card card27 = new HelperCard("Hireling");
        Card card28 = new OneShotTreasureCard("Hoard!", 0, 200, false);
        Card card29 = new ItemCard("Horny Helmet", "headgear", 1, 0, "any", 0, false, 600);
        Card card30 = new ItemCard("Huge Rock", "weapon", 3, 0, "any", 2, true, 0);
        Card card31 = new OneShotTreasureCard("Instant Wall", 0, 300, false);
        Card card32 = new OneShotTreasureCard("Invisibility Potion", 0, 200, false);
        Card card33 = new GUALCard("Invoke Obscure Rules");
        Card card34 = new GUALCard("Kill The Hireling");
        Card card35 = new ItemCard("Kneepads Of Allure", "other", 0, 0, "not clerics", 0, false, 600);
        Card card36 = new ItemCard("Leather Armor", "armor", 1, 0, "any", 0, false, 200);
        Card card37 = new ItemCard("Limburger And Anchovy Sandwich", "other", 3, 0, "halfling only", 0, false, 400);
        Card card38 = new OneShotTreasureCard("Loaded Die", 0, 300, false);
        Card card39 = new ItemCard("Mace Of Sharpness", "weapon", 4, 0, "cleric only", 1, false, 600);
        Card card40 = new OneShotTreasureCard("Magic Lamp", 0, 500, false);
        Card card41 = new OneShotTreasureCard("Magic Lamp", 0, 500, false);
        Card card42 = new OneShotTreasureCard("Magic Missile", 5, 300, true);
        Card card43 = new ItemCard("Mithril Armor", "armor", 3, 0, "not wizard", 0, true, 600);
        Card card44 = new GUALCard("Mutilate The Bodies");
        Card card45 = new OneShotTreasureCard("Nasty-Tasting Sports Drink", 2, 200, true);
        Card card46 = new ItemCard("Pantyhouse Of Giant Strength", "other", 3, 0, "not warrior", 0, false, 600);
        Card card47 = new ItemCard("Pointy Hat Of Power", "heargear", 3, 0, "wizard only", 0, false, 400);
        Card card48 = new OneShotTreasureCard("Polymorph Potion", 0, 1300, false);
        Card card49 = new GUALCard("Potion of General Studliness");
        Card card50 = new OneShotTreasureCard("Potion of Halitosis", 2, 100, true);
        Card card51 = new OneShotTreasureCard("Potion of Idiotic Bravery", 2, 100, true);
        Card card52 = new OneShotTreasureCard("Pretty Balloons", 5, 0, true);
        Card card53 = new ItemCard("Rapier of Unfairness", "weapon", 3, 0, "elf only", 1, false, 600);
        Card card54 = new ItemCard("Rat on a Stick", "weapon", 1, 0, "any", 1, false, 0);
        Card card55 = new ItemCard("Really Impressive Title", "other", 3, 0, "any", 0, false, 0);
        Card card56 = new ItemCard("Sandals Of Protection", "footgear", 0, 0, "any", 0, false, 700);
        Card card57 = new ItemCard("Shield of Ubiquity", "weapon", 4, 0, "warrior only", 1, true, 600);
        Card card58 = new ItemCard("Short Wide Armor", "armor", 3, 0, "dwarf only", 0, false, 400);
        Card card59 = new ItemCard("Singing & Danching Sword", "other", 2, 0, "not thief", 0, false, 400);
        Card card60 = new OneShotTreasureCard("Sleep Potion", 2, 100, true);
        Card card61 = new ItemCard("Slimy Armor", "armor", 1, 0, "any", 0, false, 200);
        Card card62 = new ItemCard("Sneaky Bastard Sword", "weapon", 2, 0, "any", 1, false, 400);
        Card card63 = new ItemCard("Spiky Knees", "other", 1, 0, "any", 0, false, 200);
        Card card64 = new ItemCard("Staff Of Napalm", "weapon", 5, 0, "wizard only", 1, false, 800);
        Card card65 = new OneShotTreasureCard("Steal A Level", 0, 0, false);
        Card card66 = new ItemCard("Stepladder", "other", 3, 0, "halfling only", 0, true, 400);
        Card card67 = new ItemCard("Swiss Army Polearm", "weapon", 4, 0, "human only", 2, true, 600);
        Card card68 = new OneShotTreasureCard("Transferral Potion", 0, 0, false);
        Card card69 = new ItemCard("Tuba Of Charm", "weapon", 0, 3, "any", 1, true, 300);
        Card card70 = new OneShotTreasureCard("Wand Of Dowsing", 0, 1100, false)
        Card card71 = new GUALCard("Whine At The GM");
        Card card72 = new OneShotTreasureCard("Wishing Ring", 0, 500, false);
        Card card73 = new OneShotTreasureCard("Wishing Ring", 0, 500, false);
        Card card74 = new OneShotTreasureCard("Yuppie Water", 2, 100, false);

        // Add the cards to the door pile.
        treasurePile.add(card01);
        treasurePile.add(card02);
        treasurePile.add(card03);
        treasurePile.add(card04);
        treasurePile.add(card05);
        treasurePile.add(card06);
        treasurePile.add(card07);
        treasurePile.add(card08);
        treasurePile.add(card09);
        treasurePile.add(card10);
        treasurePile.add(card11);
        treasurePile.add(card12);
        treasurePile.add(card13);
        treasurePile.add(card14);
        treasurePile.add(card15);
        treasurePile.add(card16);
        treasurePile.add(card17);
        treasurePile.add(card18);
        treasurePile.add(card19);
        treasurePile.add(card20);
        treasurePile.add(card21);
        treasurePile.add(card22);
        treasurePile.add(card23);
        treasurePile.add(card24);
        treasurePile.add(card25);
        treasurePile.add(card26);
        treasurePile.add(card27);
        treasurePile.add(card28);
        treasurePile.add(card29);
        treasurePile.add(card30);
        treasurePile.add(card31);
        treasurePile.add(card32);
        treasurePile.add(card33);
        treasurePile.add(card34);
        treasurePile.add(card35);
        treasurePile.add(card36);
        treasurePile.add(card37);
        treasurePile.add(card38);
        treasurePile.add(card39);
        treasurePile.add(card40);
        treasurePile.add(card41);
        treasurePile.add(card42);
        treasurePile.add(card43);
        treasurePile.add(card44);
        treasurePile.add(card45);
        treasurePile.add(card46);
        treasurePile.add(card47);
        treasurePile.add(card48);
        treasurePile.add(card49);
        treasurePile.add(card50);
        treasurePile.add(card51);
        treasurePile.add(card52);
        treasurePile.add(card53);
        treasurePile.add(card54);
        treasurePile.add(card55);
        treasurePile.add(card56);
        treasurePile.add(card57);
        treasurePile.add(card58);
        treasurePile.add(card59);
        treasurePile.add(card69);
        treasurePile.add(card61);
        treasurePile.add(card62);
        treasurePile.add(card63);
        treasurePile.add(card64);
        treasurePile.add(card65);
        treasurePile.add(card66);
        treasurePile.add(card67);
        treasurePile.add(card68);
        treasurePile.add(card69);
        treasurePile.add(card70);
        treasurePile.add(card71);
        treasurePile.add(card72);
        treasurePile.add(card73);
        treasurePile.add(card74);
        treasurePile.add(card65);
        treasurePile.add(card66);
        treasurePile.add(card67);
        treasurePile.add(card68);
        treasurePile.add(card69);
        treasurePile.add(card70);
        treasurePile.add(card71);
        treasurePile.add(card72);
        treasurePile.add(card73);
        treasurePile.add(card74);

    } // End of instatiateTreasurePile.

    public void instatiateBackupPiles() {

        for(Card curCard : doorPile)
            doorPile_Backup.add(curCard);
        for(Card curCard : treasurePile)
            treasurePile_Backup.add(curCard);
    }

    public void resetPiles() {
        doorPile.clear();
        treasurePile.clear();

        for(Card curCard : doorPile_Backup)
            doorPile.add(curCard);
        for(Card curCard : treasurePile_Backup)
            treasurePile.add(curCard);
    }

    public List<Card> getDoorPile() {
        return doorPile;
    }

    public List<Card> getTreasurePile() {
        return treasurePile;
    }

} // End of PileGenerator class.
