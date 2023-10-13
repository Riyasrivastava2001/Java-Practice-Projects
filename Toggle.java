import java.util.*;
public class Toggle {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int pos=1;
     int bitMask=1<<pos;
     int m= (bitMask ^ n);//XOR
     System.out.println(m);
    }
}