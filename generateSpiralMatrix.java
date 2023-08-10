package Practice.Array.TwoDArray.TwoDarray_1;

import java.util.Scanner;

public class generateSpiralMatrix {
    static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int[][] generateprintSpiralOrder(int n){
        int [][]mat=new int[n][n];
        int topRow=0;
        int bottomRow=n-1;
        int leftCol=0;
        int rightCol=n-1;
        int curr =1;


        while (curr<=n*n){
            // topRow -> leftCol to rightCol
            for (int j=leftCol;j<=rightCol && curr<=n*n;j++){
                mat[topRow][j]=curr;
               curr++;
            }
            topRow++;


            // rightCol-> topRow to bottomRow

            for (int i=topRow;i<=bottomRow && curr<=n*n;i++){
                mat[i][rightCol]=curr;
                curr++;
            }
            rightCol--;

            // bottomRow -> rightCol to leftCol
            for (int j=rightCol;j>=leftCol && curr<=n*n;j--){
                mat[bottomRow][j]=curr;
                curr++;
            }
            bottomRow--;


            // leftCol -> bottomRow to topRow
            for (int i=bottomRow;i>=topRow && curr<=n*n;i--){
                mat[i][leftCol]=curr;
                curr++;
            }
            leftCol++;

        }
        return mat;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input: ");
        int n=sc.nextInt();

        int[][]mat=generateprintSpiralOrder(n);
        printMatrix(mat);
    }
}
