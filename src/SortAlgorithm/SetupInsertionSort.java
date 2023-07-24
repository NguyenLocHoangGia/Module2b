package SortAlgorithm;

public class SetupInsertionSort {
    public static void main(String[] args) {
        int[] array = {9, 5, 1, 4, 3, 8, 6, 2, 7};

        System.out.println("Mảng ban đầu:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(array);
    }

    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
