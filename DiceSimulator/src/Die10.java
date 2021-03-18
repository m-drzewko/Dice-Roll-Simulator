import java.util.Random;

public class Die10 {
    private final int numberOfSides = 10;

    public int rollDie() {
        Random random = new Random();
        int diceRoll = random.nextInt(numberOfSides + 1);
        return diceRoll;
    }
}
