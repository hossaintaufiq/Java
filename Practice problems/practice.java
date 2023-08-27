 
 import java.util.*;
 public class practice {
    public static void main(String[] args){
        // System.out.println("Hello world ");
        Scanner n =new Scanner(System.in);
        int []arr= new int[10];

        System.out.println("Enter your array: ");
        for (int i=0; i<10; i++){
              arr[i]= n.nextInt();
        }

        System.out.println("Enter another number: ");

        int num = n.nextInt();

        boolean found = false;

        for (int i=0; i<10; i++){
            if(arr[i]==num){
                // System.out.println("found");
                found = true;
                break;
            }
            
        }

        if(found){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }


    }
}
