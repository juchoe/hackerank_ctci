package algorithms.sorting.bubbleSort;

import java.util.Scanner;

/**
    Given an -element array, , of distinct elements, sort array  in ascending order using the Bubble Sort algorithm above. Once sorted, print the following three lines:

    1) Array is sorted in numSwaps swaps., where  is the number of swaps that took place.
    2) First Element: firstElement, where  is the first element in the sorted array.
    3) Last Element: lastElement, where  is the last element in the sorted array.
 */
public class BubbleSort {

    public static int bubbleSort(int[] array) {

        int numberOfSwaps = 0;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    numberOfSwaps++;
                    swapped = true;
                }
            }
        }

        return numberOfSwaps;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int swapCount = bubbleSort(a);
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }
}
