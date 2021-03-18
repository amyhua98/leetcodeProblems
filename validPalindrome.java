class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if (s.charAt(i) < 48 || (s.charAt(i) > 57 && s.charAt(i) < 97) || s.charAt(i) > 122){
                i++;
            }else if (s.charAt(j) < 48 || (s.charAt(j) > 57 && s.charAt(j) < 97) || s.charAt(j) > 122){
                j--;
            }else{
                if (s.charAt(i) == s.charAt(j)){
                    i++;
                    j--;
                }else{
                    return false;
                }
            }
    }
    return true;
    }
}


