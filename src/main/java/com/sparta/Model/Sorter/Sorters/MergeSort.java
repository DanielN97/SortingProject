package com.sparta.Model.Sorter.Sorters;

import com.sparta.Model.Sorter.Sorter;

public class MergeSort implements Sorter {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int sizeOfInitialArray = arrayToSort.length;

        if (sizeOfInitialArray < 2) {
            return arrayToSort;
        }

        int mid = sizeOfInitialArray / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[sizeOfInitialArray - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = arrayToSort[i];
        }
        for (int i = mid; i < sizeOfInitialArray; i++) {
            rightArray[i - mid] = arrayToSort[i];
        }
        sortArray(leftArray);
        sortArray(rightArray);

        return merge(arrayToSort, leftArray, rightArray, mid, sizeOfInitialArray - mid);
    }

    public static int[] merge(int[] initialArray, int[] leftArray, int[] rightArray, int left, int right) {

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left && j < right) {
            if (leftArray[i] <= rightArray[j]) {
                initialArray[k++] = leftArray[i++];
            }
            else {
                initialArray[k++] = rightArray[j++];
            }
        }
        while (i < left) {
            initialArray[k++] = leftArray[i++];
        }
        while (j < right) {
            initialArray[k++] = rightArray[j++];
        }

        return initialArray;
    }
}
