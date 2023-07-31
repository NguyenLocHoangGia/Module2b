package Regex_String;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      while (true){
          System.out.println("Nhập lớp của bạn: ");
          String name = scanner.nextLine();
          Pattern pattern = Pattern.compile("[ACP][0-9]{4}[GHIKLM]");
          if (pattern.matcher(name).find()){
              System.out.println("Tên hợp lệ!");
              break;
          }else {
              System.out.println("Tên không hợp lệ! Nhập lại");
          }
      }
    }
}
