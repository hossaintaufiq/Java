
package labtask;

public class Box {
    public double width;
    public double height;
    public double depth;
    
    
    public Box(){
        this.width=1.00;
        this.height=1.00;
        this.depth=1.00;
    }
    
    public Box(double len){
        this.width=len;
        this.height=len;
        this.depth=len;  
    }
    
    public Box(double width, double height ,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    
    public Box(Box Box){
        this.width=Box.width;
        this.height=Box.height;
        this.depth=Box.depth;
    }
    
    
//    getting and seting the infos
    
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    
    public double getHeight(){
        return height;
    }
    public void setHeight( double height){
        this.height=height;
    }
    
    public double getDepth(){
        return depth;
    }
    
    public void setDepth(double depth){
        this.depth=depth;
    }
    
    
//    extra methods
    public double volume(double width, double height , double depth){
        return width*height*depth;
    }
            
    @Override
    public String toString() {
        return "Box [width=" + width + ", height=" + height + ", depth=" + depth + "]";
    }

}
