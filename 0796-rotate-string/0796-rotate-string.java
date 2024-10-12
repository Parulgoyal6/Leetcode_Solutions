class Solution {
    public boolean rotateString(String s, String goal) {
        
      if(s.length()!=goal.length() || goal==null || s==null){
          return false;
      }
        String doubled =s+ s;
        return doubled.contains(goal);
    }
}