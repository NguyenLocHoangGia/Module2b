package DSA.List.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInt = new MyList<>();
        listInt.add(0,1);
        listInt.add(1,2);
        listInt.add(2,3);
        listInt.add(3,4);
        listInt.remove(3);
        System.out.println(listInt.size());
        System.out.println("element 1: "+listInt.get(0));
        System.out.println("element 2: "+listInt.get(1));
        System.out.println("element 3: "+listInt.get(2));
        System.out.println("element 4: "+listInt.get(3));
    }
}
