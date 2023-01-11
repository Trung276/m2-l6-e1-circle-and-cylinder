public class Cylinder extends Circle {
    private double radius, height;
    private String color;
    public Cylinder() {

    }
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return super.getDiameter() * height + super.getArea() * 2;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", color = " + color +
                ", area = " + this.getArea() +
                '}';
    }
}
