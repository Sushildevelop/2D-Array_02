package Practice.Array.TwoDArray.TwoDarray_1;

import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Column: ");
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        System.out.println("Enter the matrix element: ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

         int trans[][]=new int[m][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                trans[i][j]=arr[j][i];
            }
        }
        // For printing result
        System.out.println("transpose:  ");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(trans[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
