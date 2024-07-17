import java.util.Random;

public class Die {
    private int value;
    private Random rand;

    // Constructor which initializes the die with a random value
    public Die() {
        rand = new Random();
        roll();
    }

    // Rolls the die and generates a new random value between 1 and 6
    public void roll() {
        value = rand.nextInt(6) + 1;
    }

    // Checks if the two dice rolled have the same value
    public boolean equals(Die die2) {
        return value == die2.value;
    }

    // Returns the string representation of the die's value
    @Override
    public String toString() {
        String text = "";
        switch (value) {
            case 1:
                text = "one";
                break;
            case 2:
                text = "two";
                break;
            case 3:
                text = "three";
                break;
            case 4:
                text = "four";
                break;
            case 5:
                text = "five";
                break;
            case 6:
                text = "six";
                break;
        }
        return text;
    }





}