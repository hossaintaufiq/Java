
package mid.prep;


public class MidPrep {
    public static void main(String[] args) {
        // Create boxes using different constructors
        Box box1 = new Box();  // Default constructor
        Box box2 = new Box(2.0);  // Constructor with single parameter
        Box box3 = new Box(3.0, 4.0, 5.0);  // Constructor with three parameters
        Box box4 = new Box(box3);  // Copy constructor

        // Set dimensions of box1 using setter methods
        box1.setWidth(2.0);
        box1.setHeight(3.0);
        box1.setDepth(4.0);

        // Calculate volume of each box
        double volume1 = box1.volume();
        double volume2 = box2.volume();
        double volume3 = box3.volume();
        double volume4 = box4.volume();

        // Print details and volume of each box
        System.out.println("Box 1 Details: " + box1);
        System.out.println("Box 1 Volume: " + volume1);

        System.out.println("Box 2 Details: " + box2);
        System.out.println("Box 2 Volume: " + volume2);

        System.out.println("Box 3 Details: " + box3);
        System.out.println("Box 3 Volume: " + volume3);

        System.out.println("Box 4 Details: " + box4);
        System.out.println("Box 4 Volume: " + volume4);

        // Check if box3 is equal to box4
        boolean isEqual = box3.equalTo(box4);
        System.out.println("Box 3 is equal to Box 4: " + isEqual);
    }
}
