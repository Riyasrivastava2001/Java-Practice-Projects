import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount of entries:");
        int n = sc.nextInt();
        int number[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the numbers");
            number[i] = sc.nextInt();

        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
           if(number[i]<min){
               min=number[i];

           }
            if(number[i]>max){
                max=number[i];

            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);


    }
}

