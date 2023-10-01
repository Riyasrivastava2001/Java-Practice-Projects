import java.util.*;
public class Average {
    public static int FindAverage(int a,int b,int c){
        int avg=0;
        avg=(a+b+c)/3;
        System.out.println("The average of the numbers "+avg);
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        System.out.println("Enter c");
        int c=sc.nextInt();

        int result=FindAverage(a,b,c);

    }
}