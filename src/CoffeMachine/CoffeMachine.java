package CoffeMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeMachine {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Coffe coffe = new Coffe();

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String userInput = in.next();

            switch (userInput) {
                case "buy":
                    try {
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                        int userInputCoffee = in.nextInt();
                        coffe.buy(userInputCoffee);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input, please enter a number (1, 2, or 3)");
                        in.nextLine();
                    }
                    break;

                case "fill":
                    try {
                        System.out.println("Write how many ml of water do you want to add:");
                        int userInputWater = in.nextInt();
                        System.out.println("Write how many ml of milk do you want to add:");
                        int userInputMilk = in.nextInt();
                        System.out.println("Write how many grams of coffee beans do you want to add:");
                        int userInputCoffeeBeans = in.nextInt();
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        int userInputCups = in.nextInt();

                        coffe.fill(userInputWater, userInputMilk, userInputCoffeeBeans, userInputCups);
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input, please enter a valid number.");
                        in.nextLine();
                    }
                    break;

                case "take":
                    coffe.take();
                    break;

                case "remaining":
                    coffe.remaining();
                    break;

                case "exit":
                    System.exit(0);

                default:
                    System.out.println("Invalid action. Please enter one of the following: buy, fill, take, remaining, exit.");
            }
        }
    }
}
