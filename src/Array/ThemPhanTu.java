package Array;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhập giá trị của các phần tử: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();

        int[] newArr = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            if (i < index - 1) {
                System.out.println("Hãy nhập vị trí lớn hơn 0");
                newArr[i] = arr[i];
            } else if (i == index - 1) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        System.out.println("Mảng mới sau khi chèn là:");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
