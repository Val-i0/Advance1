package module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Homework5 {
    public static void main(String[] args) {
        avgNegativeArray();
        sortArrayList();
        removeDuplicatesLinkedList();
    }

    private static void removeDuplicatesLinkedList() {
        LinkedList<String> linList = new LinkedList<>(Arrays.asList("_1Animal", "Two", "Four", "_1Animal", "_1Animal", "Four", "Three", "Four"));
        System.out.println("Before duplicates delete: " + linList);

        for (int i = 0; i < linList.size(); i++) {
            String temp = linList.get(i);

            for (int j = i + 1; j < linList.size(); j++) {
                if (linList.contains(temp)) {
                    linList.remove(j);
                }
            }
        }

        System.out.println("After duplicates delete: " + linList);
    }

    private static void sortArrayList() {
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList( 99, 7, 867, -81, 45, 48, 0, -9, -44, 8));
        System.out.println("Before sort: " + aList);
        Collections.sort(aList);
        System.out.println("After sort: " + aList);
    }

    private static void avgNegativeArray() {
        int[] numArray = {7, 13, -5, 8, -9, 168, 0, -7};
        int sum = 0;
        int counterNegativeNums = 0;

        for(int num : numArray) {
            if (num < 0) {
                sum += num;
                counterNegativeNums++;
            }
        }

        System.out.println("The average of all negative numbers in the array is: " + sum / counterNegativeNums);
    }
}
/*
 * ● Да се напише програма, която намира средното аритметично на
 * всички отрицателни числа в масив.
 * ● Да се напише програма, която сортира ArrayList от цели числа в
 * нарастващ ред.
 * ● Да се напише програма, която премахва всички повторения от
 * свързан списък.
 */