package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = getIntegers(10);
        printIntegers(myIntegers);
        int[] sortedIntegers = sortIntegers(myIntegers);
        printIntegers(sortedIntegers);
    }

    public static void printIntegers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " is " + array[i]);
        }
    }


    public static int[] getIntegers(int quantity) {
        int[] values = new int[quantity];
        System.out.println("Enter " + quantity + " whole numbers");
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortArray = new int[array.length];
        int currentLargest = -1;
        int currentIndex = -1;
        for (int i = 0; i < sortArray.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > currentLargest) {
                    currentLargest = array[j];
                    currentIndex = j;
                }
            }
            sortArray[i] = array[currentIndex];
            array[currentIndex] = -1;
            currentLargest = -1;
        }
        return sortArray;
    }
}