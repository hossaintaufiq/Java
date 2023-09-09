
import java.util.*;

public class sum_of_array {
    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);

        System.out.println(" inter the array length: ");
        int length = n.nextInt();
        System.out.println("Enter your array: ");
        int[] array = new int[length];
        int sum=0;


        for (int i = 0; i < length; i++) {
            array[i] = n.nextInt();

            sum += array[i];

        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
            // System.out.println(sum);
        }

        System.out.println("\n"+sum);

    }}
