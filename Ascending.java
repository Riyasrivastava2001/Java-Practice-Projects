import java.util.*;
public class Ascending {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of entries");
        int size=sc.nextInt();
        sc.nextLine();
        int Arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the numbers");
            Arr[i]=sc.nextInt();
        }

        boolean isSorted=true;
        for(int i=0;i<Arr.length-1;i++){
            if(Arr[i]>Arr[i+1]){
                isSorted=false;

            }


        }
        if(isSorted){
            System.out.println("The array is in ascending order.");
        }
        else{
            System.out.println("The array is not in ascending order");
        }

    }
}