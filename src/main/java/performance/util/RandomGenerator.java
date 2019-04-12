package performance.util;

import java.util.Random;

public class RandomGenerator {

    public Integer[] generateIntArray(int size, int range) {
        Random rand = new Random();
        Integer[] array = new Integer[size];
        for(int i = 0; i < size; i++) array[i] = rand.nextInt(range + 1);
        return array;
    }
}
