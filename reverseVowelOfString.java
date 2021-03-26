class Solution {
    
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i'|| c == 'o'
                || c == 'u'||  c == 'A' || c == 'E'
                || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;
        while(i<j){
            if (isVowel(ch[i]) && isVowel(ch[j])){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            } else if(isVowel(ch[i])){
                j--;
            } else if(isVowel(ch[j])){
                i++;
            } else {
                i++;
                j--;
            }
        }
        String ans = new String(ch);
        
        return ans;
    }
}