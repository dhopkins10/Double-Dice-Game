import java.util.Scanner;

public class DoubleDice {
    private double money;
    private Scanner scanner;
    private Die die1;
    private Die die2;

    // Constructor that initializes the game with starting amount of money and dice
    public DoubleDice(double initialMoney) {
        money = initialMoney;
        scanner = new Scanner(System.in);
        die1 = new Die();
        die2 = new Die();
    }

    // Method to start and continue the game until the amount of money is 0 or the user decides to quit

    public void playGame() {
        System.out.printf("You have $%.2f%n", money);
        while (money > 0) {
            System.out.print("How much would you like to bet (Enter 0 to quit)? ");
            double bet = scanner.nextDouble();
            if (bet == 0) {
                System.out.println("\nSee you around, winner!");
                break;
            }
            if (bet > money) {
                System.out.println("You don't have enough money to place that bet. Try again.");
                continue;
            }

            die1.roll();
            die2.roll();
            System.out.println("You rolled a " + die1 + " and a " + die2);

            if (die1.equals(die2)) {
                money += bet;
                System.out.printf("You win $%.2f%n", bet);
            } else {
                money -= bet;
                System.out.printf("You lose $%.2f%n", bet);
            }

            System.out.printf("You have $%.2f%n", money);
        }

        if (money <= 0) {
            System.out.println("You are out of money!");
            System.out.println("Better luck next time");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        DoubleDice game = new DoubleDice(100.00); // Starting with $100
        game.playGame();
    }
}