import java.util.Arrays;

class Solution {
    public int[] getStrongest(int[] arr, int k) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Find the median
        int n = arr.length;
        int median = arr[(n - 1) / 2];
        
        // Step 3: Use two-pointer approach to select k strongest elements
        int[] result = new int[k];
        int left = 0;
        int right = n - 1;
        int index = 0;
        
        while (index < k) {
            int leftDiff = Math.abs(arr[left] - median);
            int rightDiff = Math.abs(arr[right] - median);
            
            // Select the stronger element
            if (rightDiff > leftDiff || (rightDiff == leftDiff && arr[right] > arr[left])) {
                result[index++] = arr[right--];
            } else {
                result[index++] = arr[left++];
            }
        }
        
        return result;
    }
}
