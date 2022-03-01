import java.util.Arrays;

public class SelectionSort {

    public int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr;

    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort sl = new SelectionSort();
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(sl.bubbleSort(arr)));
    }
}
