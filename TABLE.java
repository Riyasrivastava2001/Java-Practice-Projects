import java.util.*;
public class TABLE {
    public static int Table(int n) {
        int t = 0;
        for (int i = 1; i <= 10; i++) {

            t = n * i;
            System.out.println(n+"x"+i+"="+t);
        }

            return t;

    }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int result=Table(n);

    }
}