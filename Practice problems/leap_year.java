// package Projects;

import java.util.*;
public class leap_year {
    public static void main(String[] args){
        System.out.println("Enter your year: ");
        Scanner y= new Scanner(System.in);

        double year = y.nextDouble();

        if(year%4==0){
            System.out.println("Your selected year is leap year");
        }

        else{
            System.out.println("Invalid year");

        }

    }
}
