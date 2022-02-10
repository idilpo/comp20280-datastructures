import java.util.*;

public class p1q10 {

    public static void shuffle(Integer[] a) {
        List<Integer> numList = Arrays.asList(a);
        Collections.shuffle(numList);
        numList.toArray(a);
        System.out.println(Arrays.toString(a));
    }


    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 6};
        shuffle(nums);
    }


}



