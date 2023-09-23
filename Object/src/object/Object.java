
package object;

public class Object {

    public static void main(String[] args) {
          // Create points
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        // Create a line with the points
        Line line = new Line(point1, point2);

        // Print line details
        System.out.println("Line Details:");
        System.out.println("Start Point: " + line.getStart());
        System.out.println("End Point: " + line.getEnd());
        System.out.println("Length: " + line.getLength());

        // Set new points for the line
        Point newStart = new Point(0, 0);
        Point newEnd = new Point(3, 3);
        line.setStart(newStart);
        line.setEnd(newEnd);

        // Print updated line details
        System.out.println("\nUpdated Line Details:");
        System.out.println("Start Point: " + line.getStart());
        System.out.println("End Point: " + line.getEnd());
        System.out.println("Length: " + line.getLength());
    
}
}


