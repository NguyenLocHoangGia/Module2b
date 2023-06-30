package Inheritance;

public class Cylinder extends Circle{
    private double height;

    public Cylinder( ) {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double VolumCylinder(){
        return getArena() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                "calculateAreaCylinder="+ VolumCylinder() +
                '}';
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println("Thể tích: "+ cylinder.VolumCylinder());
    }
}
