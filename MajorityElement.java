public class MajorityElement {

    public static int findMajority(int[] nums) {

        int candidate = 0;
        int count = 0;

        // Step 1: Find the potential majority candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify if the candidate is actually the majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 2, 2, 5, 2};

        int result = findMajority(nums);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element");
        }
    }
}