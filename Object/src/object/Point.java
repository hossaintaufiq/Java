
package object;

public class Point {
      private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter methods
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setter methods
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // String representation of Point
    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }
}

//


