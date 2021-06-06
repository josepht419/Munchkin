import java.util.Scanner;

public class Controller {

    public static void main (String[] args) {
        Player p1 = new Player(1);
        //for(Card curCard : p1.hand)
        //{
        //    if (curCard.getName().equals("Dwarf")) {
        //        p1.increaseLimit_BecomeDwarf();
        //    }
        //}
        
        //Cards of type Class added to the ArrayList <Card>
        Card c1 = new Class("Wizard");
        Card c2 = new Class("Warrior");
        Card c3 = new Class("Thief");
        Card c4 = new Class("");
        Card c5 = new Class("Amazon");
        Card c6 = new Class("Warrior");
        Card c7 = new Class("Thief");
        
        //Cards of type Race added to the ArrayList <Card>
        Card c8 = new Race("Dwarf");
        Card c9 = new Race("Elf");

        //Cards of type Monster added to the ArrayList <Card>
        Card c9 = new Monster("4,000 Orcs", 5,2,1);
        Card c10 = new Monster("Potted Plant", 2, 1, 1);

        //Cards of type MonsterModifier added to the ArrayList <Card>
        Card c11 = new 

        
        




        //public Curse(String name, String type, String subtype) {
        //    super(name, "door", "curse")
        //}
        


        
        p1.addCardToHand(c1);
        p1.addCardToHand(c2);
        p1.addCardToHand(c3);
        p1.addCardToHand(c8);

        Scanner scan = new Scanner(System.in);
        System.out.println("What card would you like to put in play?"); 
        int input = scan.nextInt();
        Card removedCard = p1.removeCardFromHand(input);
        p1.addCardToInPlayCards(removedCard);


        p1.addCardToInPlayCards(c1);
        p1.addCardToInPlayCards(c2);
        p1.addCardToInPlayCards(c3);
        
        p1.printHand();
        p1.printInPlayCards();
        

    }
}
    

