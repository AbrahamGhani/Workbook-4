package com.pluralsight;

import java.util.*;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Player> players = new ArrayList<>();

        System.out.println("Enter the number of players.");
        int numberOfPlayers = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfPlayers; i++) {
            System.out.println("Enter the name for player " + (i+1) + ":");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        Deck deck = new Deck();
        deck.shuffle();

        for (Player player : players){
            player.takeCard(deck.deal());
            player.takeCard(deck.deal());
        }
        for (Player player : players) {
            System.out.println(player.getName() + "'s hand " + player.getPlayerHand() + " has a score of: " + player.getScore());

        }

        Player winner = null;
        int highestScore = 0;

        for (Player player : players) {
            int score = player.getScore();
            if (score > highestScore && score <= 21) {
                highestScore = score;
                winner = player;
            }
        }

        if (winner != null) {
            System.out.println("🏆 " + winner.getName() + " wins with a score of " + highestScore + "!");
        } else {
            System.out.println("No winner! Everyone busted.");
        }

    }
}