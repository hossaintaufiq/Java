/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package object;


public class Object {


    public static void main(String[] args) {
        //Classname var = new Classname();
        /*Circle c1 = new Circle();
        System.out.println("Radius of the Circle is: "+c1.getRadius());
        System.out.println("Color of the Circle is: "+c1.getColor());
        System.out.println("Area of the Circle is: "+ c1.getArea());  
        
        System.out.println("");
        Circle c2 = new Circle(7);
        System.out.println("Radius of the Circle is: "+c2.getRadius());
        System.out.println("Color of the Circle is: "+c2.getColor());
        System.out.println("Area of the Circle is: "+ c2.getArea());
        */
       /* 
        System.out.println("");
        Circle c3 = new Circle(5, "Blue");
        System.out.println("Radius of the Circle is: "+c3.getRadius());
        System.out.println("Color of the Circle is: "+c3.getColor());
        System.out.println("Area of the Circle is: "+ c3.getArea());
        c3.setRadius(10);
        System.out.println(c3.getRadius()); 
        
       
       Circle c4 = new Circle(5);
       Circle c5 = new Circle(5);
       //System.out.println("These two Circles are Equal: "+c4.isEqual(c5));
       System.out.println("Count Value: "+Circle.getCount());
       */
       
       //int[] array = new int[10];
       Circle[] array = new Circle[5];
       
       for(int i =0; i<array.length; i++){
           array[i] = new Circle(i);
       }
       
        System.out.println("The Radius of the Circle is: "+array[4].getRadius());
       
       
        
        
    }
    
}
