
package lastclass;

public class Line {
    private Point start;
   private Point end;
   
   public Line  (Point start, Point end){
       this.start=start;
       this.end=end;
   }
//   public Line (int x1,int y1,int x2,int y2){
//       Point.x=x1;
//   }
   
   public Point getStart(){
       return start;
   }
   public Point getEnd(){
       return end;
   }
   
   public void setStart(Point start){
       this.start=start;
   }
   public void setEnd(Point end){
       this.end=end;
   }
   public double getLength(){
       int x1= start.getX();
       int y1= start.getY();
       int x2=end.getX();
       int y2=end.getY();
       
//       return Math.sqrt(Math.pow(x2-x1,2)-Math.pow(y2-y1,2));
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
   }
   
   
   @Override
    public String toString() {
        return "Line [start=" + start + ", end=" + end + "]";
    }
    
    
}
