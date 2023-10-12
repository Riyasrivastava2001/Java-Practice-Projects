import java.util.*;
public class ClearBitCode {
    public static void main(String[] args) {
        int n=5;//0101(position should be taken from right to left in left shift//
        int pos=2;
        int bitMask=1<<pos;

        int notBitNumber=~(bitMask);

        int newNumber=(n & notBitNumber);
        System.out.println(newNumber);
    }
}