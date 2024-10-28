class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map <Integer, Integer>map = new HashMap<>();
        int count =0;
        for(int num[]: dominoes){
            int a=num[0];
            int b=num[1];
            int key = Math.min(a,b)*10 + Math.max(a,b);
            
            count+=map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return count;
    }
}