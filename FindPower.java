import java.util.*;
public class FindPower {
    public static double Power(int x,int n){

        double result = Math.pow(x,n);
        return result;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        System.out.println("Enter the power");
        int x= sc.nextInt();
        double value;
        value =Power(n,x);
        System.out.println("The number is "+value);

    }
}