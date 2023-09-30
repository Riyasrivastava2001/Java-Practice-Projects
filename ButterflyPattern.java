public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 4;
        //upper part
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for (int i = n; i>=1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //space
            int space = 2 * (n - i);
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
