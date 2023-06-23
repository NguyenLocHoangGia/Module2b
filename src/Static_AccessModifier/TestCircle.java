package Static_AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius of the Circle: "+ circle.getRadius());
        System.out.println("Arena of the Circle: "+ circle.getArena());
    }
}
