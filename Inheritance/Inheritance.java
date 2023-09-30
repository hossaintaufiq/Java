
package inheritance;

public class Inheritance {

    public static void main(String[] args) {
//        inheritance 
//     using super and this class 
        Cylinder cy1= new Cylinder();
        
        
        System.out.println(" <<<------------value 1---------->>>> ");
        System.out.println(cy1.toString());
        
        
        System.out.println("<<<<<------------value 2--------->>>>> ");
        Cylinder cy2 = new Cylinder(3);
        System.out.println(cy2.toString());
        
        System.out.println(" <<<<<<----------value 3-------->>>>> ");
        Cylinder cy3 = new Cylinder(3,2.0, "green");
        System.out.println(cy3.toString());
        
        
    }
    
}
