import java.util.*;
public class Str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++){
           str.substring(0,(str.length()-10));

        }
        System.out.println(str.substring(0,(str.length()-10)));

        /* for(int i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }


        System.out.println(userName);*/

    }

}