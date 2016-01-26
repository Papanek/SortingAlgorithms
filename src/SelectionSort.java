/**
 * ******************************
 * Project: Sorting Algorithms
 * Creator: Daniel Papanek
 * Date :   1/26/2016
 * ******************************
 **/
public final class SelectionSort {
    private SelectionSort(){}
    /**
     * Sorts an array of integers using the selection sort algorithm
     *
     * @param arr array to be sorted
     * @return sorted array (asc)
     */
    public static int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr; // return sorted array
        }
        int minIndex;
        int minValue;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) { // Change to > for descending
                    minIndex = j;
                    // store the index which has the smallest value in arr[i..length]
                }
            }
            // swap the value at i for the next smallest value
            minValue = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = minValue;
        }
        return arr;
    }
}
