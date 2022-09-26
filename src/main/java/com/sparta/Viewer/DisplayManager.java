package com.sparta.Viewer;

public class DisplayManager {
    public void userInput(String type) {
        switch (type) {
            case "Sorting selection" -> {
                System.out.println("Choose a sorting algorithm:");
                System.out.println("1. Bubble Sort");
                System.out.println("2. Merge Sort");
                System.out.println("3. Binary Search Tree");
            }
            case "Number of elements" -> System.out.println("Choose the number of elements.");
            case "Print unsorted array" -> System.out.println("Printing the unsorted random array:");
            case "Print sorted array" -> System.out.println("Printing the sorted random array:");
        }
    }

    public void incorrectUserInput(String type) {
        switch (type) {
            case "Wrong input" -> System.out.println("Press 1, 2 or 3 to choose.");
            case "Positive number" -> System.out.println("Input a positive integer.");
        }
    }

    public void printSorter(String userChoiceOfSorting) {
        switch (userChoiceOfSorting) {
            case "1" -> System.out.println("Using Bubble Sort:");
            case "2" -> System.out.println("Using Merge Sort:");
            case "3" -> System.out.println("Using Binary Search Tree:");
        }
    }
}
