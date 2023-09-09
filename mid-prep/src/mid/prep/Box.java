
package mid.prep;

public class Box {
   
    private double width;
    private double height;
    private double depth;

    // Constructors
    public Box() {
        this.width = 1.0;
        this.height = 1.0;
        this.depth = 1.0;
    }

    public Box(double len) {
        this.width = len;
        this.height = len;
        this.depth = len;
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.depth = box.depth;
    }

    // Getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    // Methods
    public void setDim(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public boolean equalTo(Box o) {
        return this.width == o.width && this.height == o.height && this.depth == o.depth;
    }

    public double volume() {
        return width * height * depth;
    }

    @Override
    public String toString() {
        return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
    }
}
    

