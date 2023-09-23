
package testbox;

public class Box {
    private double width; 
    private double height ; 
    private double depth; 
    
    public Box (){
         this.width=1.00;
       this.height=1.00;
       this.depth=1.00;
    }
    
    public Box (double len){
         this.width=len;
    }
    public Box (double width,double height,double depth){
         this.width=width;
       this.height=height;
       this.depth=depth;
    }
//    public Box (Box box){
//         this.width=box.width;
//         this.height=box.height;
//         this.depth=box.depth;
//    }
    public Box (Box box){
        this.width=box.width;
        this.height=box.height;
        this.depth=box.depth;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return width;
    }
    public double getDepth(){
        return width;
    }
    
    public void setWidth(double width){
        this.width=width;
    }
     public void setHeight(double height){
        this.height=height;
    }
      public void setDepth(double depth){
        this.depth=depth;
    }
      
      public  void setDim (double width,double height,double depth){
         this.width=width;
       this.height=height;
       this.depth=depth;
    }
      
//      public boolean equalTo(Box o){
//          return this.width== o.width && this.height== o.height && this.depth==o.depth;
//      }
      
      public boolean equalTo(Box o ){
          return this.width==o.width && this.height==o.height&& this.depth==o.depth;
      }
      public double volume(){
          return depth*height*width;
      }
      
      @Override
      public String toString(){
      return "Box[width= "+ width+",height= "+height+", depth= "+depth+"]";
      }
}
