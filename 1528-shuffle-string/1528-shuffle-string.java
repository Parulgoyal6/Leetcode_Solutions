class Solution {
    public String restoreString(String s, int[] indices) {
        if(s==null || s.length()==0){
            return s;
        }
        
        char[] res= new char[s.length()];
        for(int i=0;i<s.length(); i++){
            res[indices[i]]=s.charAt(i);
        }
        return new String(res);
    }
}