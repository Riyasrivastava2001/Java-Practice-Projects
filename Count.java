import java.util.*;
public class Count {
    public static int CountNumbers(int n){
       if(n>0){
           System.out.println("Positive");
       }
       else if(n==0){
           System.out.println("Zeros");
       }
       else{
           System.out.println("Negative");
       }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
            int n=sc.nextInt();
            int pos=0;int neg=0;int zero=0;
            while(n!=0){
                CountNumbers(n);
                if(n>0){
                    pos++;
                }
                else if(n<0){
                    neg++;
                }
                else{
                    zero++;
                }
                n=sc.nextInt();
            }
            System.out.println("The positive numbers are "+ pos);
            System.out.println("The negative numbers are "+ neg);
            System.out.println("The zero numbers are "+ zero);

    }
}