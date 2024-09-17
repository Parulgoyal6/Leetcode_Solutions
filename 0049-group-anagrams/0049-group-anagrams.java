class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      Map<String, List<String>>list=new HashMap<>();
       
        for(String str:strs){
             char ch[]=str.toCharArray();
             Arrays.sort(ch);
             String sorted=new String(ch);
            if(!list.containsKey(sorted)){
                list.put(sorted, new ArrayList<>());
            }
            list.get(sorted).add(str);
            
        }
        return new ArrayList<>(list.values());
    }
}