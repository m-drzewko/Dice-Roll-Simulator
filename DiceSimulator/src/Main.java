import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What dice would you like to roll? (e.g. d6, d10)");
        String diceType = scanner.nextLine();
        diceType.toLowerCase(Locale.ROOT);
//        System.out.println(diceType);

        System.out.println("How many dice of the chosen type would you like to roll?");
        int numberOfDice = scanner.nextInt();

        switch (diceType) {
            case "d6":
                Die6 die6 = new Die6();
                StringBuilder diceRolls = new StringBuilder();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append("+" + die6.rollDie());
                }
                String rolls = diceRolls.toString();
//              String[] theDiceRolls = rolls.split("+");
                System.out.println("Your rolls are " + rolls);
                break;

            default:
                System.out.println("Incorrect input, try again.");
        }
    }
}
