import java.util.*;
public class BigNumber {
    public static int GreatestNumber(int a,int b){
        if((a>b)){
           return a;
        }
        else if (b>a){
            return b;
        }

        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("Enter b");
        int b=sc.nextInt();
        int result=(GreatestNumber(a,b));

            System.out.println("The greatest number is "+ result );
        }


    }
