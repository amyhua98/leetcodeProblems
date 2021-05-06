class Solution {
    public boolean isPalindrome(int x) {
       if (x < 0 || x % 10 == 0 && x != 0) 
            return false;
        int copy = x;
        int rev = 0;
        while(copy != 0){
            int temp = copy % 10;
            rev = rev * 10 + temp;
            copy /= 10;
        }
        return x == rev;
    }
}