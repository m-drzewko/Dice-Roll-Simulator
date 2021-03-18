import java.util.Random;

public class Die4 {
    private final int numberOfSides = 4;

    public int rollDie() {
        Random random = new Random();
        int diceRoll = random.nextInt(numberOfSides + 1);
        return diceRoll;
    }
}
