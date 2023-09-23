
package object;

public class Line {
     private Point start;
    private Point end;

    // Constructor
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Getter methods
    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    // Setter methods
    public void setStart(Point start) {
        this.start = start;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // Method to calculate length of Line
    public double getLength() {
        int x1 = start.getX();
        int y1 = start.getY();
        int x2 = end.getX();
        int y2 = end.getY();

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // String representation of Line
    @Override
    public String toString() {
        return "Line [start=" + start + ", end=" + end + "]";
    }
}


//
