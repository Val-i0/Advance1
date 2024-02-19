package module5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
//        printArray20by5();
//        avgValueInArray();
//        calculateArraySums();
//        uniqueNumbers(); // use HashSet to get ONLY unique numbers from array
        wordsList();
    }

    private static void wordsList() {
        /*
         * програма, която приема списък от думи и извежда броя на срещанията на всяка дума
         */
        String[] words = {"apple", "banana", "apple", "banana", "apple"};

        HashMap<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        for (String word : wordCount.keySet()) {
            int count = wordCount.get(word);
            System.out.println(word + ": " + count);
        }

    }

    private static void uniqueNumbers() {
        int[] numbers = {1, 2, 3, 1, 4, 3, 5, 2 ,1, 5};

        HashSet<Integer> uniqueNums = new HashSet<>();

        for (int number : numbers) {
            uniqueNums.add(number);
        }

        for (int uniq : uniqueNums) {
            System.out.println(uniq);
        }
    }

    private static void calculateArraySums() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of elements in array: ");
        int arraySize = scan.nextInt();

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Enter array element " + ( i + 1 ) + ": ");
            int tmp = scan.nextInt();
            array[i] = tmp;
        }

        int sumEven = 0, sumOdd = 0;

        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }

        //  изчислява сумата на всички четни и нечетни числа от поредицата
        System.out.printf("Sum of odd numbers: %s%n", sumOdd);
        System.out.printf("Sum of even numbers: %s", sumEven);
    }

    private static void avgValueInArray() {
        int[] array = {5, 10, 20, 25};
        int sum = 0;

//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }

        for(int element : array) {
            sum += element;
        }

        System.out.println(sum / array.length); // средната стойност от всички числа в масива

    }

    private static void printArray20by5() {
        // създаване на масив с 20 елемента ит целочиследн тип
        int[] array = new int[20];

        // инициализация на елементите от масива
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 5;
        }

        //  принтиране на елементите от масива в конзолата
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
        //  принтиране на елементите от масива в конзолата в масив
        System.out.println(Arrays.toString(array));
    }
}
