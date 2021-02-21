class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || x % 10 == 0 && x != 0) 
            return false;
        int y = x;
        int flip = 0;
        while(y != 0){
            int r = y%10;
            flip = flip * 10 + r;
            y /= 10;
        }
        return x == flip;
    }
}