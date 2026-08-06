public class Average {
    public static double average(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8};

        System.out.println(average(arr));
    }
}

