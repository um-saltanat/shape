package shape;
/**
 * A child class that extends abstract class Shape.
 * Represents a triangle.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 07.10.23
 */
import java.lang.Math;

public class Triangle extends Shape{

    private double side1;
    private double side2;
    private double side3;

    /**
     * Creates a triangle with specified length of all three triangle's sides.
     * @param side1 the first side of the triangle
     * @param side2 the second side of the triangle
     * @param side3 the third side of the triangle
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * A methods that returns area of the given triangle.
     * @return A double representing area of triangle.
     */
    @Override
    protected double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2.0; // semiperimeter
        double height = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
        return 0.5 * this.side3 * height;
    }

    /**
     * Method returns perimeter of the given triangle.
     * @return A double representing perimeter of triangle.
     */
    @Override
    protected double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}
