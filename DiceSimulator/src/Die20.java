import java.util.Random;

public class Die20 {
    private final int numberOfSides = 20;

    public int rollDie() {
        Random random = new Random();
        int diceRoll = random.nextInt(numberOfSides + 1);
        return diceRoll;
    }

}
