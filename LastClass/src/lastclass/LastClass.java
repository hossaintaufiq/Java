
package lastclass;

public class LastClass {

    public static void main(String[] args) {
       Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);
        
        
        Line line= new Line(point1,point2);
        
         System.out.println("Line Details:");
        System.out.println("Start Point: " + line.getStart());
        System.out.println("End Point: " + line.getEnd());
        System.out.println("Length: " + line.getLength());
    }
    
}
