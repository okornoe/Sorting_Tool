package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
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
}
