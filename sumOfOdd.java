import java.util.*;
public class sumOfOdd {
    public static int SumOdd(int n){
        int sum=0;
        int i=1;
        do{
            if(i%2!=0) {
                sum=sum+i;
                System.out.println(i);
                i=i+2;
            }
        }while(i<=n);


       return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int result=SumOdd(n);
        System.out.println("The sum of Odd Numbers is "+result);

    }
}