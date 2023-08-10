package Practice.Array.TwoDArray.TwoDarray_1;

import java.util.Arrays;
import java.util.Scanner;

public class Spiral_order_traversal {
    static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void printSpiralOrder(int [][]mat,int n, int m){
        int topRow=0;
        int bottomRow=n-1;
        int leftCol=0;
        int rightCol=m-1;
        int totalelement=0;


        while (totalelement<n*m){
            // topRow -> leftCol to rightCol
          for (int j=leftCol;j<=rightCol && totalelement<n*m;j++){
              System.out.print(mat[topRow][j]+" ");
              totalelement++;
          }
          topRow++;


            // rightCol-> topRow to bottomRow

            for (int i=topRow;i<=bottomRow && totalelement<n*m;i++){
                System.out.print(mat[i][rightCol]+" ");
                totalelement++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j=rightCol;j>=leftCol && totalelement<n*m;j--){
                System.out.print(mat[bottomRow][j]+" ");
                totalelement++;
            }
            bottomRow--;


            // leftCol -> bottomRow to topRow
            for (int i=bottomRow;i>=topRow && totalelement<n*m;i--){
                System.out.print(mat[i][leftCol]+" ");
                totalelement++;
            }
            leftCol++;

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("row: ");
        int n=sc.nextInt();
        System.out.println("Column: ");
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        int total=n*m;
        System.out.println("Enter "+total+" values");
        System.out.println("Enter the input array: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Input matrix");
        printMatrix(mat);

        System.out.println("Spiral Order");
        printSpiralOrder(mat,n,m);
    }
}
