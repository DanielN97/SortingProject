package com.sparta.Model;

import java.util.Random;

public class RandomArrayGenerator {
    public int[] generateArray(int arrayLength) {
        Random random = new Random();
        int[] arrayOfRandomNumbers = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arrayOfRandomNumbers[i] = random.nextInt();
        }

        return arrayOfRandomNumbers;
    }
}
