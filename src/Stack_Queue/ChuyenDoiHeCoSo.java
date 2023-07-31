package Stack_Queue;

import java.util.Stack;

public class ChuyenDoiHeCoSo {
    public static void main(String[] args) {
        int number =111;

    }
    public static String thapPhanSangNhiPhan(int number){
        Stack<Integer> stack = new Stack<>();

        while (number!=0){
            int phanDu = number % 2;
            stack.push(phanDu);
            number /=2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }
}
