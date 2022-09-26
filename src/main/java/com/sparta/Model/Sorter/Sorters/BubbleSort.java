package com.sparta.Model.Sorter.Sorters;

import com.sparta.Model.Sorter.Sorter;

import java.util.Arrays;

public class BubbleSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int n = arrayToSort.length;

        int[] arrayCopy = Arrays.copyOf(arrayToSort, n);

        for (int i = 0; i < n; i++) {
            boolean isSorted = true;

            for (int j = 1; j < n - i; j++) {
                if (arrayCopy[j - 1] > arrayCopy[j]) {
                    int temp = arrayCopy[j - 1];
                    arrayCopy[j - 1] = arrayCopy[j];
                    arrayCopy[j] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }

        return arrayCopy;
    }
}
