public class p1q2 {

    public static int getIndexOf(int A[], int num) {
        int returned=0;
        for (int i=0; i<A.length; i++) {
            if (A[i] == num) {returned = i;}
        }
        return returned;
    }

    public static void main(String[] args) {
        int[] arr = {90, 77, 67, 55, 75, 57, 98, 17, 50, 23, 30, 100, 34, 75, 28, 43, 14, 52, 64, 13};
        int x = 64;
        int indexOf = getIndexOf(arr, x);
        System.out.println("index of " + x + " : " + indexOf);
        System.out.println("");
    }

}

