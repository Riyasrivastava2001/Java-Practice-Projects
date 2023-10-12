import java.util.*;
public class SetBitCode {
    public static void main(String[] args) {
        int n=5;//0101(position should be taken from right to left in left shift//
        int pos=1;
        int bitMask=1<<pos;

        int newNumber = bitMask | n;
        System.out.println(newNumber);
    }
}