import java.util.*;

public class fibnacci_series {

    public static void fibonacci(int n){
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");
    
        for (int i = 1; i <= n; ++i) {
          System.out.print(firstTerm + ", ");
    
          // compute the next term
          int nextTerm = firstTerm + secondTerm;
          firstTerm = secondTerm;
          secondTerm = nextTerm;
        }
      }
    
    public static void main(String[] args){
        System.out.println("Enter your values: ");
        Scanner n=new Scanner (System.in);

        int num = n.nextInt();

        fibonacci(num); 

    }
}
