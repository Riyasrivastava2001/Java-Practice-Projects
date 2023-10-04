import java.util.*;
public class StringNames {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the total number of names to be entered");
    int size=sc.nextInt();
    sc.nextLine();

    String array[]=new String[size];
    int n=0;
    for(int i=0;i<size;i++){
        array[i]=sc.nextLine();
    }

        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }

        for(int i=0;i< size;i++){
            int l=array[i].length();
            System.out.println("The length of "+array[i]+" is "+l);
        }

        for(int i=0;i< size;i++){
            n+=array[i].length();
            System.out.println("The total cumulative (combined) length of all those strings till "+(i+1)+" is "+n);
        }

    }
}