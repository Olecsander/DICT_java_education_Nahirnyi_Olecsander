package CoffeMachine;

public class Coffe {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int cost;
    private int amountOfMilk = 540;
    private int amountOfWater = 400;
    private int numberOfCoffeeBeans = 120;
    private int numberOfCups = 9;
    private int amountOfMoney = 550;

    private void espresso(){
        water = 250;
        milk = 0;
        coffeeBeans = 16;
        cost = 4;
    }

    private void latte(){
        water = 350;
        milk = 75;
        coffeeBeans = 20;
        cost = 7;
    }

    private void cappuccino(){
        water = 200;
        milk = 100;
        coffeeBeans = 12;
        cost = 6;
    }

    private boolean hasEnoughResources() {
        if (amountOfWater < water) {
            System.out.println("Sorry, not enough water!");
            return false;
        }
        if (amountOfMilk < milk) {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
        if (numberOfCoffeeBeans < coffeeBeans) {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
        if (numberOfCups < 1) {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
        return true;
    }

    private void order(){
        if (hasEnoughResources()) {
            amountOfWater -= water;
            amountOfMilk -= milk;
            numberOfCoffeeBeans -= coffeeBeans;
            numberOfCups--;
            amountOfMoney += cost;
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    public void buy(int userInput){
        switch (userInput){
            case 1:
                espresso();
                order();
                break;

            case 2:
                latte();
                order();
                break;

            case 3:
                cappuccino();
                order();
                break;

            default:
                System.out.println("Invalid option");
        }
    }

    public void fill(int addWater, int addMilk, int addCoffeeBeans, int addCups){
        if (addWater < 0 || addMilk < 0 || addCoffeeBeans < 0 || addCups < 0) {
            System.out.println("Please enter positive numbers for resources.");
            return;
        }
        amountOfMilk += addMilk;
        amountOfWater += addWater;
        numberOfCoffeeBeans += addCoffeeBeans;
        numberOfCups += addCups;
    }

    public void take() {
        System.out.println("I gave you " + amountOfMoney);
        amountOfMoney = 0;
    }

    public void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(amountOfWater + " ml of water");
        System.out.println(amountOfMilk + " ml of milk");
        System.out.println(numberOfCoffeeBeans + " grams of coffee beans");
        System.out.println(numberOfCups + " disposable cups");
        System.out.println(amountOfMoney + " money");
    }
}
