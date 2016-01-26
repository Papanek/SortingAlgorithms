/**
 * Created by Daniel on 1/22/2016.
 */
public final class Sort {
    private Sort() {
    }

    /**
     * Sorts an array of integers using the insertion sort algorithm
     *
     * @param arr array to be sorted
     * @return sorted array (asc)
     */
    public static int[] insertionSort(int[] arr) {
        if (arr.length < 2) {
            return arr; // return sorted array
        }
        int key;
        int previous;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            previous = i - 1;
            while (previous >= 0 && arr[previous] > key) { // arr[previous] < key   for descending
                arr[previous + 1] = arr[previous]; // move the greater value forward
                previous--;
            }
            arr[previous + 1] = key; // insert key before encountering a smaller value
        }
        return arr;
    }

    /**
     * Sorts an array of integers using the selection sort algorithm
     *
     * @param arr array to be sorted
     * @return sorted array (asc)
     */
    public static int[] selectionSort(int[] arr) {
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

    /**
     * Sorts an array of integers using the bubble sort algorithm
     *
     * @param arr array to be sorted
     * @return sorted array (asc)
     */
    public static int[] bubbleSort(int[] arr) {
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