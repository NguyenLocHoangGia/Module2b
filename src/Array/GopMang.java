package Array;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng 1: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Phần tử thứ "+(n+1)+" trong mảng 1");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập số lượng phần tử của mảng 2: ");
        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Phần tử thứ "+(n2+1)+" trong mảng 2");
        for (int j = 0; j < n2; j++) {
            arr[j] = scanner.nextInt();
        }
        int arr3[]= new int[n+n2];
        for (int i = 0; i < n; i++) {
            arr[i] = arr3[i];
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = arr3[i];
        }
        System.out.println("Mảng sau khi gộp là: ");
        for (int i = 0; i < n+n2; i++) {
            System.out.println(arr3[i]);
        }
    }
}
