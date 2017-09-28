package ca.bcit.comp2526.a1c;
/**
 * Diamond class to represent a diamond.
 * @author alexhosseini
 * @version 1.0
 */
public class Diamond extends Shape {
    private static final String TYPE = "d";
    private final int width = super.getWidth();
    private final int height = width;

    /**
     * Default constructor for diamond class; calls super class .
     * @param width width of the diamond
     * @param height height of the diamond; though not relevant
     * @throws BadWidthException thrown if width is not odd
     */
    public Diamond(final int width, final int height)
                throws BadWidthException {
            super(width, width, TYPE);
            if (width % 2 == 0) {
                throw new BadWidthException();
            }
    }

    /**
     * Method to draw a diamond with '#' symbols and width.
     *
     */
    protected void draw() {
        for (int i = 1; i <= width; i += 2) {
            for (int j = 0; j < (Math.floor(width / 2) - i / 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = width - 2; i >= 1; i -= 2) {
            for (int j = 0; j < (Math.floor(width / 2) - i / 2); j++) {
                System.out.print(" ");
            }

            for (int k = i; k > 0; k--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}



