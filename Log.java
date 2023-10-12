import java.util.*;
public class Log {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for n to check if its a power of 2 or not");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        //log2(n)=log
        double log=Math.log(n)/Math.log(2);
        //Checking if log is an integer
        if(Math.ceil(log)==Math.floor(log)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


        }
    }
