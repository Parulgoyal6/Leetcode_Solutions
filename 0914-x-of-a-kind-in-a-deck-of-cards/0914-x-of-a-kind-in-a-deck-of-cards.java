class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int card: deck){
            map.put(card, map.getOrDefault(card, 0) +1);
        }
        
        int gcd=-1;
        for(int count: map.values()){
            if(gcd == -1){
                gcd =count;
            }
            else{
                gcd=findGCD(gcd, count);
            }
        }
         return gcd >= 2;
    }
    public int findGCD(int a, int b){
        return b==0 ? a : findGCD(b,a%b);
    }
}