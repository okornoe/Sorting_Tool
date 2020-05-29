package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        dataTypeSelection("line");
    }


    // Method for reading the of words in the user input
    private static void word () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        int countFreq = 0;

        while (scanner.hasNext()) {
            String word = scanner.next();
            wordList.add(word);
        }
        int wordSize = wordList.size();
        Collections.sort(wordList);
        String longestWord = wordList.get(wordSize -1);
        for (String word : wordList) {
            if (word.equals(longestWord)) {
                countFreq++;
            }
        }
        int percent = (countFreq/wordSize) * 100;

        System.out.println("Total numbers: " + wordSize + ".");
        System.out.println("The greatest number: " + wordList.get(wordSize - 1)
                + " (" + countFreq + " time(s)), " + percent + "%");
    }


    //Method for reading the of numbers/long in the user input
    private static void number () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> numberList = new ArrayList<>();
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


    //Method for reading the number of lines in the user input
    private static void line () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lineList = new ArrayList<>();
        int countFreq = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // write your code here
            lineList.add(line);
        }
        int listSize = lineList.size();
        Collections.sort(lineList);
        for (String num : lineList) {
            if (num.equals(lineList.get(listSize - 1))) {
                countFreq++;
            }
        }
        int percent = (countFreq/listSize) * 100;
        System.out.println("Total lines: " + listSize + ".");
        System.out.println("The greatest line: " + lineList.get(listSize - 1) + " (" + countFreq + " time(s))."
                + " (" + countFreq + " time(s)), " + percent + "%");
    }


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
