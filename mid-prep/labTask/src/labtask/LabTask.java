
package labtask;

public class LabTask {
    public static void main(String[] args) {
        
        Box box1= new Box();
        
        
        
        
//        setting values 

        box1.setWidth(2);
        box1.setHeight(3);
        box1.setDepth(4); 
        
        
//        calculate volume
       double volume1 = box1.volume(2,6,5);
        
        
        
//        printing values 

        System.out.println("Box 1 Values: "+ box1+"   volume is : "+volume1);
    }
    
}
