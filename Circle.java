package shape;
/**
 * A child class that extends abstract class Shape.
 * Represents a circle.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 07.10.23
 */
public class Circle extends Shape{

    private double radius;

    /**
     * Creates a circle with specified radius.
     * @param radius radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * A methods that returns area of the given circle.
     * @return A double representing area of circle.
     */
    @Override
    protected double getArea() {
        return 3.14 * (this.radius * this.radius);
    }

    /**
     * Method returns perimeter of the given circle.
     * @return A double representing perimeter of circle.
     */
    @Override
    protected double getPerimeter() {
        return 2 * 3.14 * this.radius;
    }
}
