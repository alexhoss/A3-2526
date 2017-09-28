package ca.bcit.comp2526.a1c;

/**
 * Class to represent a triangle.
 * @author alexhosseini
 * @version 1.0
 */
public class Triangle extends Shape {

    private static final String TYPE = "t";
    private final int width = super.getWidth();

    /**
     * Default constructor for a triangle. Calls super class
     * @param width width of the triangle
     * @param height height of the triangle
     * @throws BadWidthException thrown if width is not even
     */
    public Triangle(final int width, final int height)
            throws BadWidthException {
        super(width, width / 2 + 1, TYPE);
        if (width %  2 == 0) {
            throw new BadWidthException();
        }

    }

    /**
     * Method to draw the triangle with '@' symbols and appropriate width.
     */
    protected void draw() {
        for (int i = 1; i <= width; i += 2) {
        for (int j = 0; j < (Math.floor(width / 2) - i / 2); j++) {
            System.out.print(" ");
        }
        for (int k = 0; k < i; k++) {
            System.out.print("@");
        }
        System.out.println();
    }
    }
}




