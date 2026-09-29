class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        for(int i=0;i+2<s.length();i++){
            Set<Character>window=new HashSet<>();
            window.add(s.charAt(i));
            window.add(s.charAt(i+1));
            window.add(s.charAt(i+2));
            if(window.size()==3){
                count++;
            }
        }
        return count;
    }
}