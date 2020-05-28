package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        //dataTypeSelection(args[1]);
    }

/*
    // Method for reading the of words in the user input
    private static void word () {

    }
*/

    //Method for reading the of numbers/long in the user input
    private static void number () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numberList = new ArrayList();
        int index = 0;

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            // write your code here
            numberList.add(number);
        }
        int listSize = numberList.size();
        Collections.sort(numberList);
        for (Long num : numberList) {
            if (num.equals(numberList.get(listSize - 1))) {
                index++;
            }
        }
        System.out.println("Total numbers: " + listSize + ".");
        System.out.println("The greatest number: " + numberList.get(listSize - 1) + " (" + index + " time(s)).");
    }
/*

    //Method for reading the number of lines in the user input
    private static void line () {

    }
*/

    private static void dataTypeSelection (String dataType) {

        switch (dataType) {
            case "line":
                line();
                break;
            case "long":
                number();
                break;
            default:
                word();
                break;
        }
    }
}
