class Solution {
    public int[] charMap;
    public boolean isAlienSorted(String[] words, String order) {
        charMap = new int[26];
        for (int i = 0; i < order.length(); i++){
            charMap[order.charAt(i) - 'a'] = i;
        }
        for(int i = 1; i < words.length; i++){
            if (compare(words[i-1],words[i]) > 0){
                return false;
            }
        }
        return true;
    }
    
    public int compare(String word1, String word2){
        int i = 0;
        int j = 0;
        int compareVal = 0;
        
        //check if it is the same letters
        while (i < word1.length() && j < word2.length() && compareVal == 0){
            compareVal = charMap[word1.charAt(i)-'a'] - charMap[word2.charAt(j) - 'a'];
            
            i++;
            j++;
        }
        
        if (compareVal == 0){
            return word1.length() - word2.length();
        }else{
            return compareVal;
        }
    }
}