package Search;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        int indext = binarySearch(arr, 0, n-1,value);
        if (indext != -1){
            System.out.println("Giá trị "+value+" được tìm thấy ở vị trí "+indext);
        }else {
            System.out.println("Phần tử không có trong mảng!");
        }
    }
    public static int binarySearch(int[] array, int left, int right, int value){
        if (left <= right){
            int mid = (left+right)/2;

        if (array[mid] == value){
            return mid;
        }
        if (array[mid]<value){
            return binarySearch(array,mid+1,right,value);
        }
        if (array[mid]>value){
            return binarySearch(array,left,mid-1,value);
        }
        }
        return -1;
    }
}
