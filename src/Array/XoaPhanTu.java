package Array;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Nhập giá trị củ các phần tử: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = -1;
        System.out.println("Nhập phần tử cần muốn xóa");
        int value = scanner.nextInt();
        for (int i = 0; i < n; i++) {
                if (arr[i]== value){
                    index = i;
                    break;
            }
        }
        if (index != -1){
            for (int i = index; i <n-1 ; i++) {
                arr[i]=arr[i+1];
            }
            n--;
            System.out.println("Phần tử đã được xóa");
        }else {
            System.out.println("không tìm thấy phần tử");
        }
        System.out.println("Mảng sau khi xóa: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
