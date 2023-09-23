
package preclass;

public class PreClass {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        Circle c3= new Circle();
        
        c2.setRadius(5.00);
        c2.setColor("Black");
        
         c3.setRadius(8.00);
        c3.setColor("White");
        
        
        System.out.println("The color of C1 is : "+ c1.getColor());
        System.out.println("The radius of c1 is : "+c1.getRadius());
        System.out.println("The area of c1 is "+ c1.getArea());
        
        System.out.println("The color of C1 is : "+ c2.getColor());
        System.out.println("The radius of c1 is : "+c2.getRadius());
        System.out.println("The area of c1 is "+ c2.getArea());
        System.out.println("The area of c2 is "+c2.toString());
        
        System.out.println("The color of C1 is : "+ c3.getColor());
        System.out.println("The radius of c1 is : "+c3.getRadius());
        System.out.println("The area of c1 is "+ c3.getArea());
    }
    
}
