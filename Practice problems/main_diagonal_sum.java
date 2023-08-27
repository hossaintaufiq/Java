
import java.util.*;
public class main_diagonal_sum {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);

        int [][]arr =new int [3][3];

        System.out.println("Enter your array : ");

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=n.nextInt();
            }
        }

        int sum =0;
        for (int i=0;i<3;i++){
            sum += arr[i][i];
        }

        System.out.println("The sum of the main diagonal will be : "+ sum);
    }
}
