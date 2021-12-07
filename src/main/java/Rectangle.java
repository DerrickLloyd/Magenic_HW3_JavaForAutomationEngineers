import java.util.Scanner;

/**
 * TODO FOR HOMEWORK - Rectangle.java
 *      [X] Update this class to inherit from BaseShape.java
 *      [X] Update to a valid and logical constructor
 *      [X] Add a static main method
 */
public class Rectangle extends BaseShape {

    /**
     * TODO FOR HOMEWORK: Update the below constructor
     * Creates an instance of the Rectangle class
     * @param length The length of the rectangle
     * @param height The width of the rectangle
     */
    public Rectangle(double length, double height) {
        super("Rectangle", length, height);
    }

    // TODO FOR HOMEWORK: Add a static main method for any debugging purposes
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side length:");
        int length = Integer.parseInt(scanner.nextLine());
        r.setLength(length);
        System.out.println("Enter height:");
        int height = Integer.parseInt(scanner.nextLine());
        r.setHeight(height);

        System.out.println("A rectangle with side length of " + r.getLength() + " and height of " +r.getHeight() + " has an area of: " + r.area());
        System.out.println("A triangle with side length of " + r.getLength() + " and height of " +r.getHeight() + " has a perimeter of: " + r.perimeter());
    }
}
