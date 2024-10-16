class Solution {
    public String sortString(String s) {
      
        int []freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }
        
        StringBuilder res= new StringBuilder();
        int length =s.length();
     
        while(res.length() < length){
            for(int i=0;i<26;i++){
                if(freq[i]>0){
                    res.append((char)(i+'a'));
                    freq[i]--;
                }
            }
            
            for(int i=25;i>=0;i--){
                if(freq[i]>0){
                    res.append((char)(i+'a'));
                    freq[i]--;
                }
            }
        }
        
        return res.toString();
    }
}