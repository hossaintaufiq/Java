
package testbox;

public class TestBox {
    public static void main(String[] args) {
        Box b1= new Box();
        Box b2=new Box();
        Box b3 =new Box();
        Box b4= new Box(b3);
        
        
        b2.setWidth(5.00);
        
        
        b3.setDepth(3.40);
        b3.setWidth(4.11);
        b3.setHeight(5.22);
        
        
        b4.setDepth(3.40);
        b4.setWidth(4.11);
        b4.setHeight(5.22);
        
        
        
        
        
//        box 1 info
        System.out.println("B1="+b1.toString());
        
//        box 2 info
        System.out.println("B2="+b2.toString());
        System.out.println("B2 volume= "+ b2.volume());
        
//        box 3 info 
         System.out.println("B3="+b3.toString());
        System.out.println("B3 volume= "+ b3.volume());
        
//        box 4 
        System.out.println("Box 4 is equal to box 3 : "+ b4.equalTo(b3));
        
        
    }
    
}
