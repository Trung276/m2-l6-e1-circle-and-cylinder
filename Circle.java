public class Circle {
    final double pi = 3.14;
    private double radius;
    private String color;
    public Circle() {

    }
    public  Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getDiameter() {
        return 2 * pi * radius;
    }
    public double getArea() {
        return pi * radius * radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Circle{" +
                "radius = " + radius +
                ", color = " + color +
                ", diameter = " + this.getDiameter() +
                ", area = " + this.getArea() +
                '}';
    }
}
