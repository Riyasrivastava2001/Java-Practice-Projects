import java.util.*;
public class Spiral {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows and columns");
       int n=sc.nextInt();
       int m=sc.nextInt();
       int matrix[][]=new int[n][m];

       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            matrix[i][j]= sc.nextInt();
           }
        }
       System.out.println("The spiral order matrix is:");
       int row_start=0;
       int row_end=n-1;
       int column_start=0;
       int column_end=m-1;

       while(row_start<=row_end && column_start<=column_end){
           for(int col=column_start;col<=column_end;col++){
               System.out.println(matrix[row_start][col]+" ");
           }
           row_start++;

           for(int row=row_start;row<=row_end;row++){
               System.out.println(matrix[row][column_end]+" ");
           }
           column_end--;

           for(int col=column_end;col>=column_start;col--){
               System.out.println(matrix[row_end][col]+" ");
           }
           row_end--;

           for(int row=row_end;row>=row_start;row--){
               System.out.println(matrix[row][column_start]+" ");
           }
           column_start++;
           System.out.println();
       }

    }
}