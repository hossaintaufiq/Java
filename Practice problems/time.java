import java.util.*;
public class time {
    public static void main(String[] args){
        System.out.println("Enter seconds: ");
        Scanner t=new Scanner(System.in);

        int time=t.nextInt();
        // int seconds=time%60;
        int hour=time/3600;
        int m=time-(hour*3600);
        int minutes=m/60;
        int seconds=m -(minutes*60);
        System.out.println(hour+":"+minutes+":"+seconds);
    }
    
}
