class Solution {
    public boolean validMountainArray(int[] arr) {
        int min=arr[0];
        if(arr.length < 3)
            return false;
       int i=0;
       int n = arr.length;
       while(i + 1 < n && arr[i]<arr[i+1])
           i++;
        
        if(i == 0 || i == n-1)
            return false;
        while(i + 1 < n && arr[i]>arr[i+1])
            i++;
        
        return i==n-1;
    }
}