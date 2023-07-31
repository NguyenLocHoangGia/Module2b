package Regex_String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NumberPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String numberPhone = scanner.nextLine();
            Pattern pattern = Pattern.compile("^\\([0-9]{2}\\)-\\((0)[0-9]{9}\\)$");
            if (pattern.matcher(numberPhone).find()){
                System.out.println("SĐT hợp lệ");
                break;
            }else {
                System.out.println("SĐT không hợp lệ! Nhập lại");
            }
        }
    }
}
