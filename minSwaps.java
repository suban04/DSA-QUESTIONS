import java.util.*;

class Solution {
    public int minSwaps(int[] nums) {
        int zeros = 0;

        // Count total number of zeros
        for (int num : nums) {
            if (num == 0) {
                zeros++;
            }
        }

        // Find number of 1s inside the window of size 'zeros'
        int ones = 0;
        int minSwaps = Integer.MAX_VALUE;

        // First window
        for (int i = 0; i < zeros; i++) {
            if (nums[i] == 1) {
                ones++;
            }
        }

        minSwaps = ones;

        // Sliding window
        for (int i = zeros; i < nums.length; i++) {

            // Add new element
            if (nums[i] == 1) {
                ones++;
            }

            // Remove old element
            if (nums[i - zeros] == 1) {
                ones--;
            }

            minSwaps = Math.min(minSwaps, ones);
        }

        return minSwaps;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 0, 1, 0, 1, 0};

        System.out.println(obj.minSwaps(nums));
    }
}