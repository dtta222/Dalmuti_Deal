//*************************************************************************
//M10-Dalmuti Deal.java
//Date: 03/30/2023
//Author: David Taylor
//Class: CIT 149–19Z1–78178
//Instructor: Krishna Nandanoor
//Purpose: Develop a Java application where you will create an 80-element array to hold the cards from The Great
// Dalmuti deck. Afterwards, you will ask the user how many players are in the game, and you will deal all the
// cards in the deck to the appropriate players.
//
// The game can be played with 4-8 players. However, we will assume the game is being played with 4 players.
// After the cards have been shuffled in the deck (moved around in the array), deal all the cards to the players.
// Cards are dealt one at a time from the top of the deck until all cards are given to the players.
// Display the card in the following format:
//
// Player1 Player2 Player 3 Player4
// ==========================================================================================
// 4: Baroness 2: Archbishop 12: Peasant 6: Knight
// 10: Shepherdess 11: Stonecutter 1: Dalmuti 3: Earl Marshal
//...................
//*************************************************************************

public class Main {

    //Static method used to shuffle the cards in the array
    public static void shuffleCards(String deck[]) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }

    //Static method used to create the display of the players’ cards
    public static void dealCards(String deck[]) {

        int count = 1;
        //display cards for 4 players
        for (int i = 0; i <= 79; i++) {
            System.out.printf("%-15s\t\t\t", deck[i]);
            //print out newline every 4 cards
            if (count%4 == 0) {
                System.out.println();
            }
            count++;
        }
    }

    public static void main(String[] args) {

        //array for cards
        String[] cards = new String[80];

        //assign cards to array
        for(int i=0; i<=79; i++) {

            if (i == 0) {
                cards[i] = "1: Dalmuti";
            } else if (i <= 2) {
                cards[i] = "2: Archbishop";
            } else if (i <= 5) {
                cards[i] = "3: Earl Marshal";
            } else if (i <= 9) {
                cards[i] = "4: Baroness";
            } else if (i <= 14) {
                cards[i] = "5: Abbess";
            } else if (i <= 20) {
                cards[i] = "6: Knight";
            } else if (i <= 27) {
                cards[i] = "7: Seamstress";
            } else if (i <= 35) {
                cards[i] = "8: Mason";
            } else if (i <= 44) {
                cards[i] = "9: Cook";
            } else if (i <= 54) {
                cards[i] = "10: Shepherdess";
            } else if (i <= 65) {
                cards[i] = "11: Stonecutter";
            } else if (i <= 77) {
                cards[i] = "12: Peasant";
            } else {
                cards[i] = "13: Jester";
            }
        }

        //shuffle cards
        shuffleCards(cards);

        //display interface
        System.out.printf("%-15s\t\t\t%-15s\t\t\t%-15s\t\t\t%-15s", "Player 1", "Player 2", "Player 3", "Player 4");
        System.out.println("\n==========================================================================================");

        //display cards
        dealCards(cards);
    }
}