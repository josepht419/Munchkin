package utilities;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

import java.util.Scanner;

import basic_game_components.*;
import door_cards.*;
import treasure_cards.*;

public class PileGenerator {

    private FileOutputStream fos;
    private ObjectOutputStream oos;

    public PileGenerator(String pileType, String command) {
        
    }

    private void run(String pileType, String command) {
        
    }

    private void addCommand() {
        Scanner inputScan = new Scanner(System.in);

        System.out.println("Which pile would you like to add to? (Options: \"door\", \"treasure\"");

        String pileType = inputScan.nextLine();

        if(pileType.equals("treasure")) {
             
        }

        FileInputStream fis = new FileInputStream("backend\\piles\\door_pile.txt")
        ObjectInputStream ois = new ObjectInputStream(fis);




    }
    
} // End of PileGenerator class.
