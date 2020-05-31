package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) {
        dataTypeSelection(args[1]);
    }


    // Method for reading the of words in the user input
    private static void word () {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> wordList = new ArrayList<>();
        double countFreq = 0;
        int z = 1;

        while (scanner.hasNext()) {
            String word = scanner.next().trim();
            wordList.add(word);
        }
        int wordSize = wordList.size();
        String longestWord = wordList.get(0);

        for (int i = 0; z < wordSize-1; i++,z++) {
            if (longestWord.length() < wordList.get(i).length()) {
                longestWord = wordList.get(i);
            }
        }

        for (String wordL : wordList) {
            if (wordL.equals(longestWord)) {
                countFreq++;
            }
        }

        int percent = (int) ((countFreq/wordSize) * 100);

        System.out.println("Total words: " + wordSize + ".");
        System.out.println("The longest word: " + longestWord
                + " (" + (int)countFreq + " time(s)), " + percent + "%).");
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
        double countFreq = 0;
        int z = 1;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            // write your code here
            lineList.add(line);
        }

        int listSize = lineList.size();
        String longestLine = lineList.get(0);

        for (int i = 1; i < listSize ; i++, z++) {
            if (longestLine.length() < lineList.get(i).length()) {
                longestLine = lineList.get(i);
            }
        }

        for (String num : lineList) {
            if (num.equals(longestLine)) {
                countFreq++;
            }
        }

        int percent = (int) ((countFreq/listSize) * 100);
        System.out.println("Total lines: " + listSize + ".");
        System.out.println("The longest line:");
        System.out.println(longestLine);
        System.out.println("(" + (int)countFreq + " time(s)), " + percent + "%");
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