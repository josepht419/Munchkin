import basic_game_components.*;
import door_cards.*;
import treasure_cards.*;

import java.util.Scanner;


/**
 * This class is used to test functionalities of the Munchkin backend using console input and output.
 */
public class Controller {

    public static void main (String[] args) {
        Player p1 = new Player(1);
        //for(Card curCard : p1.hand)
        //{
        //    if (curCard.getName().equals("Dwar2f")) {
        //        p1.increaseLimit_BecomeDwarf();
        //    }
        //}
        
        //Cards of type Class added to the ArrayList <Card>
        Card c1 = new ClassCard("Wizard");
        Card c2 = new ClassCard("Warrior");
        Card c3 = new ClassCard("Thief");
        Card c4 = new ClassCard("");
        Card c5 = new ClassCard("Amazon");
        Card c6 = new ClassCard("Warrior");
        Card c7 = new ClassCard("Thief");
        
        Pile c1 = new 
        
        //Cards of type Race added to the ArrayList <Card>
        Card c8 = new RaceCard("Dwarf");
        Card c9 = new SimpleUsableOnceCard("Flame Potion", 3);

        //Cards of type Monster added to the ArrayList <Card>
        Card c10 = new MonsterCard("Potted Plant", 2, 1, 1);

        
        




        //public Curse(String name, String type, String subtype) {
        //    super(name, "door", "curse")
        //}
        


        
        p1.addCardToHand(c1);
        p1.addCardToHand(c2);
        p1.addCardToHand(c3);
        p1.addCardToHand(c8);

        Scanner scan = new Scanner(System.in);
        System.out.println("What card would you like to put in play?(Numbers)"); 
        int input = scan.nextInt();
        Card removedCard = p1.removeCardFromHand(input);
        p1.addCardToInPlayCards(removedCard);


        p1.addCardToInPlayCards(c1);
        p1.addCardToInPlayCards(c2);
        p1.addCardToInPlayCards(c3);
        
        p1.printHand();
        p1.printInPlayCards();
        

    } // End of main method.

} // End of Controller class.
    

