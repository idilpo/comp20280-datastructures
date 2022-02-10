import java.util.Arrays;
import java.util.OptionalInt;

public class p1q8 {
// Kadane's algorithm
    public static int maxSubarraySum(int[] arr) {
        int meh = 0; // maximum_ending_here (largest sum starting from the beginning and ending in the index we are currently at)
        int msf = Integer.MIN_VALUE; // maxiumum_so_far (may or may not include the current index we are at)
        for (int i=0; i<arr.length; i++) {
            meh += arr[i];
            if (meh < arr[i]) {meh = arr[i];}
            if (msf < meh) {msf = meh;}
        }
        return msf;
    }

    public static void main(String[] args) {
        int[] A = {1, 2, -3, -4, 0, 6, 7, 8, 9};
        System.out.println(maxSubarraySum(A));
        int[] B = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubarraySum(B));
    }
}
