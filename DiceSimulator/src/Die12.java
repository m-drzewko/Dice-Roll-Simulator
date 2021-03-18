import java.util.Random;

public class Die12 {
    private final int numberOfSides = 12;

    public int rollDie() {
        Random random = new Random();
        int diceRoll = random.nextInt(numberOfSides + 1);
        return diceRoll;
    }
}
