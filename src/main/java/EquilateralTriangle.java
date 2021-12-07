import java.util.Scanner;

import static java.lang.Math.sqrt;

/**
 * TODO FOR HOMEWORK - EquilateralTriangle.java
 *      [X] Update this class to inherit from BaseShape.java
 *      [X] Update to a valid and logical constructor
 *      [X] Override the area method
 *      [X] Override the perimeter method
 *      [X] Add a static main method
 */
public class EquilateralTriangle extends BaseShape {

    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * NOTE: Remember you only need the length (Same thing as the base) to find the height of an equilateral triangle
     *       height = (sqrt(3)/2) * length
     * Creates an instance of the EquilateralTriangle class
     * @param length The base length of the triangle
     */
    public EquilateralTriangle(double length) {
        super("Equilateral Triangle", length, length);
    }

    public double getHeight() {
        return sqrt(3) * getLength() / 2;
    }

    // TODO FOR HOMEWORK: Override the area() method from BaseShape to work for a triangle
    public double area() {
        double height = sqrt(3) * getLength() / 2;
        return (getLength() * height)/2;
    }

    // TODO FOR HOMEWORK: Override the perimeter() method from BaseShape to work for a triangle
    public double perimeter() {
        return 3 * this.getLength();
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        EquilateralTriangle t = new EquilateralTriangle(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side length:");
        int length = Integer.parseInt(scanner.nextLine());

        t.setLength(length);

        System.out.println("A triangle with side length of " + t.getLength() +  " has an area of: " + t.area());
        System.out.println("A triangle with side length of " + t.getLength() + " has a perimeter of: " + t.perimeter());
    }
}