import java.util.ArrayList;
import java.util.List;

public class p1q3 {

    public static List getCommonElements(String[] a1, String[] a2) {
        List<String> common_elements = new ArrayList<String>();
        for (int i=0; i<a1.length; i++) {
            for (int j=0; j<a2.length; j++) {
                if (a1[i].equals(a2[j])) {common_elements.add(a1[i]);}
            }
        }
        return common_elements;
    }

    public static void main(String[] args) {
        String[] arr1 = {"nail", "cure", "vagabond","riddle","act", "songs", "zipper", "excite",
                "magical", "eager","blood","coast", "guess", "selfish","milky","ticket","authority"};
        String[] arr2 = {"cure","wicked", "guess", "vagabond","riddle", "act", "excite","songs",
                "troubled", "eager","blood","coast", "waiting", "selfish","milky","ticket","authority", "nail"};
        System.out.println(getCommonElements(arr1, arr2));
        System.out.println("");
    }

}
