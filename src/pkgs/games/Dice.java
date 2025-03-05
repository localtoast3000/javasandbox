package pkgs.games;

import java.util.Random;

public class Dice {
    private final Random rand = new Random();
    private int sides;

    public Dice(int sides) {
        setSides(sides);
    }

    public int roll() {
        return rand.nextInt(sides) + 1;
    }

    private void setSides(int sides) {
        if (sides >= 2 && sides <= 12) {
            this.sides = sides;
        } else {
            throw new Error("Sides must be a number from 2 to 12");
        }
    }
}
