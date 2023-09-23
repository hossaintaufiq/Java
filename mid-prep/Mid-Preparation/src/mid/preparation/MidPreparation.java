package mid.preparation;

import java.util.*;

public class MidPreparation {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

//      --------->>> 2. multipliying 2 double value
//       Scanner sc =new Scanner(System.in);
//       
//       System.out.println("Enter your number");
//       double num1 = sc.nextDouble();
//       double num2 = sc.nextDouble();
//       
//       
//       System.out.println(num1*num2);
//     --------->>>> 4. finding ascii value of a character 
//          System.out.println("Enter your character: ");
//          Scanner c = new Scanner(System.in ); 
//          
//          char character = c.next().charAt(0);
//          
//          System.out.println("character is : "+ character);
//          System.out.println("The ascii value of the character is "+(int)character);
//  --------------->>>>>>6.Java Program to Swap Two Numbers
//        System.out.println("Enter your numbers : ");
//        
//        double num1= n.nextDouble();
//        double num2 = n.nextDouble();
//        
//        System.out.println("---------Before swap------");
//        System.out.println("number 1 = "+ num1+ " number 2 = "+ num2);
//        
//        double temp = num1; 
//        num1=num2;
//        num2=temp;
//        
//        System.out.println("---After swap---");
//        System.out.print("number 1 = "+ num1+"number 2 =" + num2 );
//                
//--------->>> find character is upper case or lower case  
//       System.out.println("Enter your character : "); 
//       
//       char ch = n.next().charAt(0);
//       
//       if(65<=(int)ch && (int)ch<=91){
//           System.out.println("the character is upper case");
//       }
//       else if(97<=(int)ch && (int)ch<=123){
//           System.out.println("the character is lower case");
//       }
//       else {
//          System.out.print("invalid input");
//       }
//        ----------->>>>> check the input character is vowel or consonent 
//        System.out.println("Enter your character : ");
//        
//        char ch = n.next().charAt(0);
//        
//        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//            System.out.println("The input character is a vowel");
//        }
//        else {
//            System.out.println("The input character is a consonant");
//        }
////         ----------->>>>>>> Find the Largest Among Three Numbers
//
//       System.out.print("Enter your 1st number: ");
//       int n1= n.nextInt();
//       System.out.print("Enter your 2nd number: ");
//       int n2= n.nextInt();
//       System.out.print("Enter your 3rd number: ");
//       int n3= n.nextInt();
//       
//       if(n1>=n2 && n1>=n3){
//           System.out.println("The Largest number is ==> "+n1 );
//       }
//       else if (n2>=n1&& n2>=n3){
//           System.out.println("The Largest number is ==> "+n2);
//       }
//       else{
//           System.out.println("The largest number is ==> "+ n3);
//       }
//       
//          ---------------->>>>>>>>>. Find all Roots of a Quadratic Equation
//                System.out.println("Enter the value of  a : ");
//                double a =n.nextDouble();
//                System.out.println("Enter the value of  b : ");
//                double b =n.nextDouble();
//                System.out.println("Enter the value of  c : ");
//                double c =n.nextDouble();
//                
//                double determinent = (b*b)-(4*a*c);
//                
//                if(determinent>0){
//                    double root1 = ((-b + Math.sqrt(determinent))/(2*a));
//                    double root2 = ((-b - Math.sqrt(determinent))/(2*a));
//                    
//                    System.out.println("Root 1 : "+ root1+ "Root 2 : "+ root2);
//                }
//                
//                else if (determinent==0){
//                    double root1 = (-b/(2*a));
//                     double root2=root1;
//                    
//                    System.out.println("Root 1 : "+ root1+ "Root 2 : "+ root2);
//                }
//                else {
//                    double root1 = -b/(2*a);
//                    double imaginary= ((Math.sqrt(-determinent)/(2*a)));
//                    
//                    System.out.println("Root 1 : "+ root1+" + "+imaginary+ "  Root 2 : "+ root1+"-"+imaginary);
//                    
//                }
//        ----------->>>>leap year 
//                                 System.out.println("Enter your year ");
//                                 
//                                 int y= n.nextInt();
//                                 
//                                 if ((y%400==0) || (y%4==0 && y%100==0)){
//                                     System.out.println("The year is leapyear");
//                                     
//                                 }
//                                 else {
//                                     System.out.println("The year is not leapyear");
//                                 }
//            ------------->>>> Check Whether a Character is Alphabet or Not
//
//                            System.out.println("Enter your character : ");
//                            
//                            char ch=n.next().charAt(0);
//                            
//                            if(((int)ch>=65 && (int)ch<=91)||((int)ch>=97 && (int)ch<=123)){
//                                System.out.println("The character is an Alphabate ");
//                            }
//                            else {
//                                System.out.println("The character is not an Alphabate. ");
//                            }
//                  ----------->>>>>Java Program to Find Factorial of a Number
//                                        System.out.println("Enter your number: ");
//                                        int num =n.nextInt();
//                                        
//                                        int factorial=1;
//                                        
//                                        for(int i=1;i<=num;i++){
//                                            factorial*=i;
//                                        }
//                                        System.out.println(factorial);
//                      --------->>>>>>>>>Java Program to Generate Multiplication Table
//                                             System.out.println("Enter your number : ");
//                                             int num=n.nextInt();
//                                             
//                                             System.out.println("The table of "+num+"is given bellow: ");
//                                             for(int i=1;i<=10;i++){
//                                                 int total=i*num;
//                                                 
//                                                 System.out.println(num +" * "+i+" = "+total );
//                                             }
//             ------------>>>>>> 17. fibnacci series 

//                System.out.println("Enter how many number you want to see in the fibnacci series ");
//                
//                int num = n.nextInt(); 
//                int first_num=0;
//                    int second_num=1;
//                    
//                for(int i= 0;i <num;i++){
//                    System.out.print(first_num+",");
//                    int sum= 0;
//                    sum=first_num+second_num;
//                    first_num=second_num;
//                    second_num=sum;
//                   
//                }


//        ---------------- >>>>>>Java Program to Find GCD of two Numbers
    }

}
