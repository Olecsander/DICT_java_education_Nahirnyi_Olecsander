package Hangman;

import java.util.Scanner;
import java.util.Random;

public class hangman {

    public static void main(String[] args) {
        boolean playAgain = true;
        Scanner scanner = new Scanner(System.in);

        while (playAgain) {
            System.out.println("HANGMAN");
            System.out.print("Type \"play\" to play the game, \"exit\" to quit: > ");
            String userInput = scanner.next();

            if (userInput.equals("play")) {
                playGame();
            } else if (userInput.equals("exit")) {
                System.out.println("Goodbye!");
                playAgain = false;
            } else {
                System.out.println("Invalid input. Please enter \"play\" or \"exit\".");
            }
        }
    }

