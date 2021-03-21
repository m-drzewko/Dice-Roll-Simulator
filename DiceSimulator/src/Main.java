import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("What dice would you like to roll? (e.g. d6, d10)");
        String diceType = scanner.nextLine();

        System.out.println("How many dice of the chosen type would you like to roll?");
        int numberOfDice = scanner.nextInt();

        String errorMessage = "";
        int lastStringIndex;
        StringBuilder diceRolls = new StringBuilder();

        switch (diceType) {
            case "d6":
                Die6 die6 = new Die6();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die6.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            case  "d4":
                Die4 die4 = new Die4();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die4.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            case  "d8":
                Die8 die8 = new Die8();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die8.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            case  "d10":
                Die10 die10 = new Die10();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die10.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            case  "d12":
                Die12 die12 = new Die12();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die12.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            case  "d20":
                Die20 die20 = new Die20();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die20.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            case  "d100":
                Die100 die100 = new Die100();
                for (int i = 1; i <= numberOfDice; i++) {
                    diceRolls.append(die100.rollDie());
                    if (i >= 1) {
                        diceRolls.append("+");
                    }
                }
                lastStringIndex = diceRolls.length() - 1;
                diceRolls.deleteCharAt(lastStringIndex);
                break;

            default:
                errorMessage = "Incorrect input, try again.";
                break;
        }

        String rolls = diceRolls.toString();
        if (errorMessage.equals("")) {
            System.out.println("Your rolls are: " + rolls);
        } else {
            System.out.println(errorMessage);
        }
    }
}
