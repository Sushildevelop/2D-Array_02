package Practice.Array.TwoDArray.TwoDarray_1;

import java.util.Scanner;

public class Pascals_Triangle {
    static int[][] pascal(int n){
        int[][] ans=new int[n][];
        for (int i=0;i<n;i++){
            //ith row has i+1 columns
            /*
            jagged array
            ans[0]=new int[1]
            ans[1]=new int[2]
             */
            ans[i]=new int[i+1];

            // 1 st and last element of every row is 1
            ans[i][0]=ans[i][i]=1;

            //
            for (int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }

        }
       return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ans=pascal(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
