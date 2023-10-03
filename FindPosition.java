import java.util.*;
public class FindPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of rows and columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the element to be searched");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("The position of the element is at" + "(" + i + "," + j + ")");
                }
            }


        }
    }
}