package Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class DaoNguoc {
    public static void DaoNguoc(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu là: ");
        printArray(arr);

        DaoNguoc(arr);
        System.out.println("Mảng sau khi đảo:");
        printArray(arr);

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

}
