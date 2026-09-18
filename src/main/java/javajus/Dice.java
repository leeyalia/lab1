package javajus;

import java.util.random.RandomGenerator;

public class Dice {
    static int diceroll(){
        return RandomGenerator.getDefault().nextInt(1, 7);
    }

}
