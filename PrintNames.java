import java.util.*;
public class PrintNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many names you want to enter:");
        int size=sc.nextInt();
        sc.nextLine();
        String Names[]=new String[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the name");
            Names[i]=sc.nextLine();

        }

        for(int i=0;i<Names.length;i++){
            System.out.println("Name "+(i+1)+" is "+Names[i]+".");
        }
    }
}