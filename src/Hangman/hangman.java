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

    private static void playGame() {
        String[] words = {"python", "java", "javascript", "kotlin"};
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String secretWord = words[randomIndex];

        int attemptsLeft = 8;
        boolean[] guessedLetters = new boolean[26];

        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0) {
            displayCurrentWord(secretWord, guessedLetters);
            System.out.print("Input a letter: > ");
            String userInput = scanner.next();

            if (userInput.length() != 1) {
                System.out.println("You should input a single letter");
                continue;
            }

