class Solution {
    public int firstUniqChar(String s) {
        // int []charCounts=new int[26];
        // for(int i=0;i<s.length();i++){
        //     charCounts[s.charAt(i)-'a']++;
        // }
        // for(int i=0;i<s.length();i++){
        //     if(charCounts[s.charAt(i)-'a']==1)
        //     return i;
        // }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(map.get(key)==1)
            return i;
        }
    return -1;
    }
}