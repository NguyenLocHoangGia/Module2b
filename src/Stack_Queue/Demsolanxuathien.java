package Stack_Queue;

import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class Demsolanxuathien {
    public static void main(String[] args) {
        TreeMap<String, Integer> key = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần tìm: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");
        for (String word : words) {
            String format = word.toLowerCase();
            if (key.containsKey(format)) {
                int number = key.get(format);
                key.put(format, number + 1);
            } else {
                key.put(format, 1);
            }
        }
        System.out.println("Kết quả: ");
        for (String word : key.keySet()) {
            int frequency = key.get(word);
            System.out.println(word + " " + frequency);
        }
    }
}
