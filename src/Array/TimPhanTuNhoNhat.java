package Array;

import java.util.Scanner;

public class TimPhanTuNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phần thử thứ "+(i
                    +1));
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] <min){
                min= arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: "+min);
    }
}
