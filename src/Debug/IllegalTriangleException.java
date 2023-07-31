package Debug;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

class TriangleApp {
    public static void main(String[] args) {
        try {
            int side1 = inputSide("Nhập cạnh thứ nhất: ");
            int side2 = inputSide("Nhập cạnh thứ hai: ");
            int side3 = inputSide("Nhập cạnh thứ ba: ");

            checkTriangle(side1, side2, side3);

            System.out.println("Ba cạnh trên tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }

    private static int inputSide(String message) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print(message);
        return scanner.nextInt();
    }

    private static void checkTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh phải có giá trị dương.");
        }
        if ((side1 + side2) <= side3 || (side1 + side3) <= side2 || (side2 + side3) <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại.");
        }
    }
}


