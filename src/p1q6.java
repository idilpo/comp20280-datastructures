import java.util.Arrays;


public class p1q6 {

    public static void getTriples(int[] arr, int n) {
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                for (int k=j; k<arr.length; k++) {
                    if (i!=j && j!=k && i!=k ) {
                        if (arr[i] + arr[j] + arr[k] == n) {
                            System.out.println("{" + arr[i] + ", " + arr[j] + ", " + arr[k] + "}");
                        }
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arrayy = {-1,12,4,7,3,2,1,2,0,1,5};
        int target = 3;
        getTriples(arrayy, target);
    }

}
