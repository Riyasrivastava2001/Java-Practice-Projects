public class GetBitCode {
    public static void main(String[] args) {
        int n=5;//0101(position should be taken from right to left in left shift//
        int pos=2;
        int bitMask=1<<pos;

        if((bitMask & n)==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}