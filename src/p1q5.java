import java.util.Random;

public class p1q5 {

    public static double[][] matProd(double[][] mat1, double[][] mat2) {
        double prod[][] = new double[5][5];
        for (int i=0; i< mat1.length; i++) { // gives num of columns
            for (int j=0; j<mat1[0].length; j++) { // gives num of rows
                for (int k=0; k<mat1[0].length; k++) {
                    prod[i][j] = prod[i][j] + mat1[i][k] * mat2[k][j];
                }
            }
        }
        for (int i=0; i<mat1.length; i++) {
            for (int j=0; j<mat1.length; j++) {
                System.out.print(prod[i][j] + " ");
            }
            System.out.println("");
        }
        return prod;
    }

    public static void main(String[] args) {
        int k=5, l=5;
        double matrix1[][] = new double[k][l];
        double matrix2[][] = new double[k][l];
        // initialise the matrices at random:
        Random rand = new Random();
        for (int i=0; i<k; i++) {
            for (int j=0; j<l; j++) {
                matrix1[i][j] = rand.nextDouble();
                matrix2[i][j] = rand.nextDouble();
            }
        }
        double prod[][] = matProd(matrix1, matrix2);
        System.out.println(prod);
    }
}
