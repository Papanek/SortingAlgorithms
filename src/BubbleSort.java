/**
 * ******************************
 * Project: Sorting Algorithms
 * Creator: Daniel Papanek
 * Date :   1/26/2016
 * ******************************
 **/
public class BubbleSort {
    private BubbleSort(){}
    /**
     * Sorts an array of integers using the bubble sort algorithm
     *
     * @param arr array to be sorted
     * @return sorted array (asc)
     */
    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr; // return sorted array
        }
        int temp;
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = arr.length - 1; j > i; j--) {
                // from the end to the start compare two values
                // swap if the first > second
                if (arr[j - 1] > arr[j]) { // change to < for desc
                    swapped = true;
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
            if (!swapped) { // if no swaps, array is sorted
                break;
            }
        }
        return arr;
    }
}
