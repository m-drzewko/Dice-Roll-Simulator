import java.util.Random;

public class Die6 {
    private final int numberOfSides = 6;

    public int rollDie() {
        Random random = new Random();
        int diceRoll = random.nextInt(numberOfSides + 1);
        return diceRoll;
    }
}
