
import java.util.*;

public class reverse_array {

    public static   void reverse(int[] array) {
        int length = array.length;

        for (int i = 0; i < length/2 ; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
            // return temp;

        }
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Enter your array length: ");
        int length = n.nextInt();

        int[] arr = new int[length];
        System.out.println("Enter your array : ");

        for (int i = 0; i < length; i++) {
            arr[i] = n.nextInt();
        }

        reverse(arr);

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i]+" , ");
        }

    }
}
