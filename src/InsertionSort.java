/**
 * ******************************
 * Project: Sorting Algorithms
 * Creator: Daniel Papanek
 * Date :   1/26/2016
 * ******************************
 **/
public final class InsertionSort {
    private InsertionSort(){}
    /**
     * Sorts an array of integers using the insertion sort algorithm
     *
     * @param arr array to be sorted
     * @return sorted array (asc)
     */
    public static int[] sort(int[] arr) {
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
}
