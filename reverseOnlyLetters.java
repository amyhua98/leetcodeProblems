class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder reverse = new StringBuilder();
        int j = S.length() - 1;
        for (int i = 0; i < S.length(); i++){
            if(Character.isLetter(S.charAt(i))){
                while(!Character.isLetter(S.charAt(j))){
                    j--;
                }
                reverse.append(S.charAt(j));
                j--;
            }else{
                reverse.append(S.charAt(i));
            }
        }
        return reverse.toString();
    }
}