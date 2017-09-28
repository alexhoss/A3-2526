package ca.bcit.comp2526.a1c;

/**
 * Abstract class for all shapes to inherit.
 * @author alex hosseini
 * @version 1.0
 */
public abstract class Shape {
    private final String type;
    private final int width;
    private final int height;

    /**
     * Default Shape constructor.
     * @param width width of the shape.
     * @param height of the shape.
     * @param type of the shape.
     */
    protected Shape(final int width, final int height, final String type) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    /**
     * abstract method to draw; sub shapes should implement own draw method.
     */
    abstract void draw();

    /**
     * method to return type of shape.
     * @return the type of the s hape
     */
    public String getType() {
        return type;
    }

    /**
     * method to return width of shape.
     * @return the width of the shape
     */
    public int getWidth() {
        return width;
    }

    /**
     * method to return height of shape.
     * @return the height of the shape
     */
    public int getHeight() {
        return height;
    }

}


