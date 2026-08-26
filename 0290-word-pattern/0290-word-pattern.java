class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[]words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        HashMap<Character,String> charW=new HashMap<>();
        HashSet<String> usedWords=new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];
            if(charW.containsKey(c)){
                if(!charW.get(c).equals(word)){
                    return false;
                }
                }else{
                    if(usedWords.contains(word)){
                        return false;
                    }
                    charW.put(c,word);
                    usedWords.add(word);
                }
            }
            return true;
    }
    
}