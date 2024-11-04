class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int evenIndex = 0;
        int oddIndex = n - 1;

        // Separate even and odd numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                result[evenIndex++] = num; // Place even number in the front
            } else {
                result[oddIndex--] = num; // Place odd number in the back
            }
        }
        
        return result;
    }
}
