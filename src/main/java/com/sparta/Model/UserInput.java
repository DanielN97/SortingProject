package com.sparta.Model;

import com.sparta.Controller.Main.Starter;
import com.sparta.Viewer.DisplayManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);
    private final DisplayManager displayManager = new DisplayManager();
    public static Logger logger = LogManager.getLogger(Starter.class);

    public String verifyCorrectSortingInput() {
        String userChoiceOfSorting = scanner.nextLine();

        while (true) {
            if (userChoiceOfSorting.equals("1") || userChoiceOfSorting.equals("2") || userChoiceOfSorting.equals("3")) {
                break;
            } else {
                displayManager.incorrectUserInput("Wrong input");
                userChoiceOfSorting = scanner.nextLine();
            }
        }

        return userChoiceOfSorting;
    }

    public int verifyCorrectArrayLength() {
        int lengthOfArray;

        while (true) {
            try {
                lengthOfArray = Integer.parseInt(scanner.nextLine());

                if (lengthOfArray > 0) {
                    break;
                } else {
                    displayManager.incorrectUserInput("Positive number");
                }
            } catch (NumberFormatException exception) {
                logger.error(exception.getMessage(), exception);
                displayManager.incorrectUserInput("Positive number");
            }
        }

        return lengthOfArray;
    }
}
