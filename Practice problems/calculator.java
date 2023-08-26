import java.util.*;


public class calculator {
    public static void main (String[] args){
        System.out.println("Enter your numbers: ");
        Scanner n=new Scanner (System.in);

        double n1=n.nextDouble();
        double n2=n.nextDouble();

        double addition =n1+n2;
        double difference =n1-n2;
        double multiplication =n1*n2;
        double divide=n1/n2;

        System.out.println("The addition will be: "+addition+ "\nThe difference will be: "+difference +"\nThe divide will be: "+divide + "\nThe multiplication will be"+ multiplication);





    }
    
}
