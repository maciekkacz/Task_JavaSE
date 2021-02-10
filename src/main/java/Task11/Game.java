package Task11;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        String[] words = {"Mama", "Tata", "Dom", "Siostra", "Woda", "Tort"};
        Scanner scanner = new Scanner( System.in );
        Random random = new Random();
        int fails = 0;
        int mistakes = 3;
        int round = 0;
        String response;

        while (fails <= mistakes) {

            String word = words[random.nextInt( words.length )];
            String hashWord = word;

            char randomChar = hashWord.charAt( random.nextInt( word.length() ) );
            hashWord = hashWord.replace( String.valueOf( randomChar ), "*" );

            System.out.println("Twoje wylosowane słowo: " + hashWord);
            System.out.println("Podaj słowo: ");
            response = scanner.nextLine();

            if (word.equalsIgnoreCase( response )) {
                System.out.println("Jesteś zwycięscą");
                round++;
            }
            else {
                fails++;
            }

        }
        System.out.println("KOniec gry  ilość ruchów " + (round ) );



    }
}
