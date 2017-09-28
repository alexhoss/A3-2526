package ca.bcit.comp2526.a1c;

/**
 * Class to represent a Rectangle.
 * @author alexhosseini
 * @version 1.0
 */
public class Rectangle extends Shape {

    private static final String TYPE = "r";
    private final int width = super.getWidth();
    private final int height = super.getHeight();

    /**
     * Default constructor for rectangle class; calls super class.
     * @param width width of the rectangle
     * @param height height of the rectangle
     */
    public Rectangle(final int width, final int height) {
        super(width, height, TYPE);
    }

    /**
     * Method to draw the rectangle with '*' and appropriate height and width.
     */
    protected void draw() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
            System.out.print('*');
        }
        System.out.println();
    }
    }
}


