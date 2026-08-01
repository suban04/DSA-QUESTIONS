public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {10, 9, 1, 1, 1, 2, 3, 1};

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // Agar swap nahi hua to array already sorted hai
            if (!swapped) {
                break;
            }
        }

        // Print Sorted Array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}