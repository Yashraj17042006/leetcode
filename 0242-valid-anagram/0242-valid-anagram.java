class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
        return false;

        // int[] chars=new int[26];
        // for(int i=0;i<s.length();i++){
        //     chars[s.charAt(i)-'a']++;
        //     chars[t.charAt(i)-'a']--;
        // }
        // for(int x:chars){
        //     if(x!=0)
        //     return false;
        // }
        // return true;
        // method 2:
        // char arr1[]=s.toCharArray();
        // char arr2[]=t.toCharArray();
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // return Arrays.equals(arr1,arr2);
        // method-3:
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            if(!map.containsKey(key) || map.get(key)<=0)
            return false;
            map.put(key,map.get(key)-1);
        }
        return true;
    }
}