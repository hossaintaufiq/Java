import java.util.*;
public class Introduction {
    public static void myName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        
        myName(name);
    }
    
}