public class SlidingWindow {

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int windowSum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {

            windowSum = windowSum - arr[i - k] + arr[i];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        System.out.println("Maximum Sum = " + maxSum);
    }
}