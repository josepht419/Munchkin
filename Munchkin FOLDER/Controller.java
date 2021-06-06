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

        Card c1 = new Card("Wizard", "door", "class");
        Card c2 = new Card("Warrior", "door", "class");
        Card c3 = new Card("Thief", "door", "class");
        Card c4 = new Card("Super Munchkin", "door", "class");
        Card c5 = new Card("Amazon", "door", "curse");
        Card c6 = new Card("Warrior", "door", "class");
        Card c7 = new Card("Thief", "door", "class");
        Card c8 = new Monster("Jabberwock", 17, 4, 2);
        Card c9 = new Curse();

        //public Curse(String name, String type, String subtype) {
        //    super(name, "door", "curse")
        //}
        


        
        p1.addCardToHand(c1);
        p1.addCardToHand(c2);
        p1.addCardToHand(c3);
        p1.addCardToHand(c8);

        Scanner scan = new Scanner(System.in);
        System.out.println("What card would you like to remove ?"); 
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
    

