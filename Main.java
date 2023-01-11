import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double radius, height;
        String color;
        while (i != 1 && i != 2) {
            System.out.println("Chose shape");
            System.out.println("1. Circle");
            System.out.println("2. Cylinder");
            i = sc.nextInt();
        }
        if (i == 1) {
            System.out.println("Enter the radius ");
            radius = sc.nextDouble();
            System.out.println("Enter the color ");
            color = sc.next();
            Circle circle = new Circle(radius);
            circle.setRadius(radius);
            circle.setColor(color);
            System.out.println(circle.toString());
        }

        if (i == 2) {
            System.out.println("Enter the radius ");
            radius = sc.nextDouble();
            System.out.println("Enter the height ");
            height = sc.nextDouble();
            System.out.println("Enter the color ");
            color = sc.next();
            Cylinder cylinder = new Cylinder(radius,height);
            cylinder.setRadius(radius);
            cylinder.setHeight(height);
            cylinder.setColor(color);
            System.out.println(cylinder.toString());
        }
    }
}
