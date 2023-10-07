package shape;
/**
 * A child class that extends class Rectangle.
 * Represents a square.
 *
 * @author Saltanat Umarova
 * @version 1.0
 * @since 07.10.23
 */
public class Square extends Rectangle{

   private double length;

    /**
     * Creates a square with specified length of square's all four sides.
     * @param length length of the square's side.
     */
    public Square(double length) {
        this.length = length;
    }

    /**
     * A methods that returns area of the given square.
     * @return A double representing area of square.
     */
    @Override
    protected double getArea() {
        return this.length * this.length;
    }

    /**
     * Method returns perimeter of the given square.
     * @return A double representing perimeter of square.
     */
    @Override
    protected double getPerimeter() {
        return 4 * this.length;
    }
}
