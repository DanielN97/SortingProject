package com.sparta.Controller.Main;

import com.sparta.Controller.SortManager;
import com.sparta.Model.Timer;
import com.sparta.Model.UserInput;
import com.sparta.Model.RandomArrayGenerator;
import com.sparta.Model.Sorter.Sorter;
import com.sparta.Viewer.ArrayPrinter;
import com.sparta.Viewer.DisplayManager;
import com.sparta.Viewer.TimerPrinter;

public final class Starter {
    public static void start() {
        DisplayManager displayManager = new DisplayManager();
        UserInput userInput = new UserInput();

        displayManager.userInput("Sorting selection");
        String userChoiceOfSorting = userInput.verifyCorrectSortingInput();

        displayManager.userInput("Number of elements");
        int lengthOfArray = userInput.verifyCorrectArrayLength();

        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator();
        int[] arrayOfRandomNumbers = randomArrayGenerator.generateArray(lengthOfArray);

        displayManager.userInput("Print unsorted array");
        ArrayPrinter.print(arrayOfRandomNumbers);

        Timer.start();

        SortManager sortManager = new SortManager();
        Sorter sorter = sortManager.getSorter(userChoiceOfSorting);
        int[] sortedArray = sorter.sortArray(arrayOfRandomNumbers);

        long time = Timer.runTime();

        displayManager.printSorter(userChoiceOfSorting);
        displayManager.userInput("Print sorted array");
        ArrayPrinter.print(sortedArray);

        TimerPrinter.print(time);
    }
}
