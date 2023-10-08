package shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean loop = true;
        while (loop) {
            System.out.println("Choose a shape type (Rectangle, Circle, Triangle, Square): ");
            String shapeType = scanner.next();

            // Based on user's input creates a required shape
            switch (shapeType) {
                case "Rectangle" :
                    System.out.println("Select width and height of the rectangle: ");
                    double width = scanner.nextDouble();
                    double height = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(width, height);
                    System.out.println("Area of the rectangle: " + rectangle.getArea());
                    System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
                    break;

                case "Circle" :
                    System.out.println("Select radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of the circle: " + circle.getArea());
                    System.out.println("Perimeter of the circle: " + circle.getPerimeter());
                    break;

                case "Triangle" :
                    System.out.println("Select length of the triangle's sides: ");
                    double side1 = scanner.nextDouble();
                    double side2 = scanner.nextDouble();
                    double side3 = scanner.nextDouble();
                    Triangle triangle = new Triangle(side1, side2, side3);
                    System.out.println("Area of the triangle: " + triangle.getArea());
                    System.out.println("Perimeter of the triangle: " + triangle.getPerimeter());
                    break;

                case "Square" :
                    System.out.println("Select length of the square's side: ");
                    double length = scanner.nextDouble();
                    Square square = new Square(length);
                    System.out.println("Area of the square: " + square.getArea());
                    System.out.println("Perimeter of the square: " + square.getPerimeter());
                    break;

                default:
                    System.out.println("Invalid shape.");
                    break;

            }

            // Checks if user want to continue creating new shapes
            System.out.println("Try again? Select Y(yes) or N(no):");
            String loopCheck = scanner.next();
            if (loopCheck.equals("N")) {
                loop = false;
            }
        }

    }

}
