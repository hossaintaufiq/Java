
package labtask;

public class LabTask {
    public static void main(String[] args) {
        
//        Box box1= new Box();
        Box box1 = new Box();  // Default constructor
        Box box2 = new Box(2.0);  // Constructor with single parameter
        Box box3 = new Box(3.0, 4.0, 5.0);  // Constructor with three parameters
        Box box4 = new Box(box3);
        
//        setting values 

        box1.setWidth(2);
        box1.setHeight(3);
        box1.setDepth(4); 
        
        
//        calculate volume
       double volume1 = box1.volume();
       double volume2=box2.volume();
       double volume3 = box3.volume();
       double volume4= box4.volume();
        
        
        
//        printing values 

        System.out.println("Box 1 Values: "+ box1+"   volume is : "+volume1);
        System.out.println("Box 2 Values: "+ box2+"   volume is : "+volume2);
        System.out.println("Box 3 Values: "+ box3+"   volume is : "+volume3);
        System.out.println("Box 4 Values: "+ box4+"   volume is : "+volume4);
        
        
        boolean isEqual = box3.equalTo(box4);
        System.out.print("box 3 equal to box 4 "+ isEqual);
        
        
    }
    
}
