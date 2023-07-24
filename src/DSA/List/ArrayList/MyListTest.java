package DSA.List.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();

        // Thêm phần tử vào danh sách
        myList.add(0,0);
        myList.add(20,1);
        myList.add(30,2);
        System.out.println("Danh sách sau khi thêm phần tử: " + myList);

        // Kiểm tra kích thước danh sách
        System.out.println("Kích thước của danh sách: " + myList.size());

        // Xóa phần tử
        myList.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử: " + myList);

        // Kiểm tra phần tử có tồn tại trong danh sách hay không
        System.out.println("Có chứa phần tử 30 không? " + myList.contains());

        // Lấy chỉ số của phần tử
        System.out.println("Chỉ số của phần tử 20: " + myList.indexOf(20));

        // Lấy phần tử tại vị trí
        System.out.println("Phần tử tại vị trí 0: " + myList.get(0));

        // Xóa danh sách
        myList.clear();
        System.out.println("Danh sách sau khi xóa: " + myList);
    }
}
