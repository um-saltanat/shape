package shape;
/**
 * A child class that extends abstract class Shape.
 * Represents a rectangle.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 07.10.23
 */
public class Rectangle extends Shape{

    private double width;
    private double height;

    /**
     * Create a rectangle with specified width and height.
     * @param width rectangle width
     * @param height rectangle height
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Creates a rectangle without any specified parameters.
     */
    public Rectangle() {
    }

    /**
     * A methods that returns area of the given rectangle.
     * @return A double representing area of rectangle.
     */
    @Override
    protected double getArea() {
        return this.width * this.height;
    }

    /**
     * Method returns perimeter of the given rectangle.
     * @return A double representing perimeter of rectangle.
     */
    @Override
    protected double getPerimeter() {
        return 2 * (this.width + this.height);
    }


}
