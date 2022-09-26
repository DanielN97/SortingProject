package com.sparta;

import com.sparta.Model.Sorter.Sorters.BinaryTree.BinaryTree;
import com.sparta.Model.Sorter.Sorters.BubbleSort;
import com.sparta.Model.Sorter.Sorters.MergeSort;
import com.sparta.Model.Sorter.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    public void checkRightOutput1() {
        int[] arrayTest = new int[] {5, 4, 3, 2, 1};
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};

        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        Sorter binaryTree = new BinaryTree();

        Assertions.assertArrayEquals(expectedArray, bubbleSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, mergeSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, binaryTree.sortArray(arrayTest));
    }

    @Test
    public void checkRightOutput2() {
        int[] arrayTest = new int[] {1, 2, 3, 4, 5};
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};

        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        Sorter binaryTree = new BinaryTree();

        Assertions.assertArrayEquals(expectedArray, bubbleSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, mergeSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, binaryTree.sortArray(arrayTest));
    }

    @Test
    public void checkRightOutput3() {
        int[] arrayTest = new int[] {15, 7, 3, 19, 21, 9};
        int[] expectedArray = new int[] {3, 7, 9, 15, 19, 21};

        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        Sorter binaryTree = new BinaryTree();

        Assertions.assertArrayEquals(expectedArray, bubbleSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, mergeSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, binaryTree.sortArray(arrayTest));
    }

    @Test
    public void checkInputArrayEmpty() {
        int[] arrayTest = new int[] {};
        int[] expectedArray = new int[] {};

        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        Sorter binaryTree = new BinaryTree();

        Assertions.assertArrayEquals(expectedArray, bubbleSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, mergeSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, binaryTree.sortArray(arrayTest));
    }

    @Test
    public void checkArrayWithOneInt() {
        int[] arrayTest = new int[] {2};
        int[] expectedArray = new int[] {2};

        Sorter bubbleSort = new BubbleSort();
        Sorter mergeSort = new MergeSort();
        Sorter binaryTree = new BinaryTree();

        Assertions.assertArrayEquals(expectedArray, bubbleSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, mergeSort.sortArray(arrayTest));
        Assertions.assertArrayEquals(expectedArray, binaryTree.sortArray(arrayTest));
    }
}