import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 5, 2, 8};

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {

            if (set.contains(num)) {
                System.out.println(num + " is duplicate");
            } else {
                set.add(num);
            }

        }
    }
}