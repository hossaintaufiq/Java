import java.util.*;

public class avarage{
    public static void main(String[] args){
        System.out.println("Enter 3 numbers: ");

        Scanner n= new Scanner (System.in);

        double num1=n.nextDouble();
        double num2=n.nextDouble();
        double num3=n.nextDouble();

        double total=num1+num2+num3;
        double ave=total/3;

        System.out.println("Your average is : " +ave);
    }
}