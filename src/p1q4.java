import java.util.Random;

public class p1q4 {

    public static int[][] addMatrices(int[][] m1, int[][] m2) {
        int sum[][] = new int[m1.length][m1[0].length];
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
            //System.out.println();//new line
        }
        for (int i=0; i<m1.length; i++) {
            for (int j=0; j<m1.length; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println("");
        }
        return sum;
    }

    public static void main(String[] args) {
        int m=5, n=5;
        int mat1[][] = new int[m][n];
        int mat2[][] = new int[m][n];
        // initialise the matrices randomly:
        Random rnd = new Random();
        for (int i=0; i<m; i++) {
            for (int j=0; i<n; i++) {
                mat1[i][j] = rnd.nextInt();
                mat2[i][j] = rnd.nextInt();
            }
        }
        //int sum[][] = addMatrices(mat1, mat2);
        //System.out.println(sum);
        int[][] mat_arr = addMatrices(mat1, mat2);
        //System.out.println(addMatrices(mat1, mat2)[0][0]);
        System.out.println("");
    }
}
