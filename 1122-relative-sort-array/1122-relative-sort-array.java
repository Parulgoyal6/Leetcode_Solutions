class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map =new HashMap<>();
      
        for(int num: arr1){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(int num: arr2){
            int count = map.get(num);
            for(int i=0; i<count;i++){
                list.add(num);
            }
            map.remove(num);
        }
        List<Integer>remaining = new ArrayList<>(map.keySet());
        
        Collections.sort(remaining);
        for(int num: remaining){
            int count = map.get(num);
            for(int i =0; i<count; i++){
                list.add(num);
            }
        }
      
        int[] resultArray = list.stream().mapToInt(i -> i).toArray();
        return resultArray;
    }
}