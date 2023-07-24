package SortAlgorithm;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 4, 3, 8, 6, 2, 7};

        System.out.println("Mảng ban đầu:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(array);
    }

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;

            System.out.print("\nBước " + i + ": ");
            printArray(array);
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

