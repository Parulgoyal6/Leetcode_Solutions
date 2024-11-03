import java.util.HashMap;

class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashMap<Integer, Integer> firstOccurrenceMap = new HashMap<>();
        HashMap<Integer, Integer> lastOccurrenceMap = new HashMap<>();
        
        int maxFrequency = 0;
        
        // Populate maps with frequency and first/last occurrences
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            
            // Update frequency of each element
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            
            // Track the first occurrence of each element
            if (!firstOccurrenceMap.containsKey(num)) {
                firstOccurrenceMap.put(num, i);
            }
            
            // Track the last occurrence of each element
            lastOccurrenceMap.put(num, i);
            
            // Update max frequency
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(num));
        }
        
        // Find the minimum length of subarrays with the same degree
        int minLength = nums.length;
        for (int num : frequencyMap.keySet()) {
            if (frequencyMap.get(num) == maxFrequency) {
                int length = lastOccurrenceMap.get(num) - firstOccurrenceMap.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }
        
        return minLength;
    }
}
