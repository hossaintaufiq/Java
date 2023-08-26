import java.util.*;

public class table {
    public static void main(String[] args){
        System.out.println("Enter your number for the table: ");
        Scanner n=new Scanner(System.in);

        double num=n.nextDouble();
        double table;
        for(int i=1;i<=10;i++){
            table=num*i;

            System.out.println(num+ "*"+ i +"=" +table);

        }

    }
}
