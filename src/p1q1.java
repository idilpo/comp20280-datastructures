import java.util.*;

public class p1q1 {

    // Q1:
    public double question1(int[] A) {
        int sum=0;
        for (int i=0; i<A.length; i++) {sum += A[i];}
        double average = (double) sum / A.length + 1;
        return average;
    }

    public static void main(String[] args) {
        p1q1 q1 = new p1q1();
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println(q1.question1(my_array));
        System.out.println("");
    }
}
