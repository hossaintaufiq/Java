
package inheritance;

public class Circle {
    private double radius;
    private String color;
    
    
    public Circle (){

       this(1.0,"red");
    }
    
    public Circle (double radius){
        this(radius, " red");
    }
    public Circle (double radius, String color ){
        this.radius= radius ; 
        this.color= color; 
    }
    
//    getter methods 
    
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    
//    setter methods
    
    public void setRadius(double radius){
        this.radius=radius;
    }
     public void setColor(String color){
        this.color=color;
    }
     
     public double getArea(){
         return this.radius*this.radius;
     }
     
     
     @Override
     public String toString(){
         return "Radius: "+this.getRadius()+ " Color: "+ this.getColor();
     }
}
