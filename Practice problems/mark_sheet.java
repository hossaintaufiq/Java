import java.util.*;

public class mark_sheet {

    public static void main(String[] args) {
        System.out.println("Enter your marks: ");

        Scanner m = new Scanner(System.in);

        double marks = m.nextDouble();

        if (marks > 0 && marks < 50) {
            System.out.println("You are fail");

        } else if (marks >= 51 && marks <= 60) {
            System.out.println("D GRADE");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("C GRADE");
        }
         else if(marks>=71 && marks<=80){
            System.out.println("B GRADE");
        }
         else if(marks>=81 && marks<=100){
            System.out.println("A GRADE");
        }
        else {
            System.out.println("Invalid Mark");
        }
    
    }
}
