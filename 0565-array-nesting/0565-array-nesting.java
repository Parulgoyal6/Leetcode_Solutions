class Solution {
    public int arrayNesting(int[] nums) {
        int maxLength=0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int index = i;
        while (nums[index] != -1) {
            int start = nums[index];
           nums[index]= -1;
           index=start;
            count++;
            
        }
            maxLength = Math.max(maxLength, count); 
        }
        
        return maxLength;
            
    } 
}
