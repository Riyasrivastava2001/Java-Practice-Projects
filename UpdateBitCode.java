import java.util.Scanner;

public class UpdateBitCode {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        //oper=1:set oper=0:clear
        int n=5;//0101
        int pos=1;
        int bitMask = 1 << pos;


        if(oper==1) {
            //set

            int newNum = (n | bitMask);
            System.out.println(newNum);
        }
        else{
            //clear
            int notBinaryNum = ~(bitMask);
            int newNumber=(notBinaryNum & n);
            System.out.println(newNumber);

        }




    }
}