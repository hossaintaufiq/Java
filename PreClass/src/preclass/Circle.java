
package preclass;

public class Circle {
    private double radius = 1.0;
    private String color= "red";
    
    
    public void circle (){
       radius=2.00;
       color= "blue";
    }
    
    public void circle (double radius, String color){
       this.radius=radius;
       this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    
    public void setRadius(double radius){
        this.radius=radius;
    }
    
    public void setColor(String color){
        this.color=color;
    }
    
    public double getArea(){
        return Math.PI*radius*radius;
    }
    
    @Override 
    public String toString(){
        return "Radius = " + radius + " , color = "+ color ;
    }
}
