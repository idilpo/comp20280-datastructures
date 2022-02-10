
public class p1q9 {

    public static int longestBitonic(int[] arr, int n) {
        int[] inc = new int[n]; // length of increasing subarray ending
        int[] dec = new int[n]; // length of decreasing subarray starting

        int max;
        inc[0] = 1; // length of increasing sequence ending at first index is 1
        dec[n-1] = 1; // length of increasing sequence starting at first index is 1


        // construct increasing sequence array:
        for (int i=1; i<n; i++) {
            inc[i] = (arr[i] >= arr[i - 1]) ? inc[i - 1] + 1 : 1;
        }

        // construct decreasing sequence array:
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = (arr[i] >= arr[i + 1]) ? dec[i + 1] + 1 : 1;
        }

        // find the length of maximum length bitonic sequence:
        max = inc[0] + dec[0] - 1;
        for (int i = 1; i < n; i++) {
            if (inc[i] + dec[i] - 1 > max) {
                max = inc[i] + dec[i] - 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A = {4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5};
        int[] B = {13, 5, 12, 15, 13, 16, 8, 2, 4, 17, 17, 6, 12, 17, 2, 3, 17, 16, 17, 5, 3, 19, 12, 6,
                17, 9, 19, 2, 2, 15, 14, 16, 5, 4, 8, 6, 18, 16, 2, 14, 18, 13, 19, 12, 12, 3, 16, 11, 8, 3};

        int n1 = A.length;
        System.out.println("Length of max length Bitnoic Subarray is " + longestBitonic(A, n1));
        int n2 = B.length;
        System.out.println("Length of max length Bitnoic Subarray is " + longestBitonic(B, n2));
    }

}
