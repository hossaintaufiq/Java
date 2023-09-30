
package inheritance;

public class Cylinder extends Circle{
    private double height; 
    
    public Cylinder(){
        this.height=1.0;
    }
    
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder (double height, double radius){
        super(radius);
        this.height=height;
        
    }
    public Cylinder(double height, double radius , String color ){
        super(radius, color);
        this.height= height;
    }
    
    public double getVolume(){
        return this.getArea()*this.height;
    }
    
    @Override 
    public String toString (){
        return super.toString()+ " Height: " + this.height+ " Volume: " + getVolume();
    }
}
