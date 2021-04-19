class Solution {
    public int addDigits(int num) {
        while(num > 9){
            int tens = num / 10;
            int ones = num % 10;
            num = tens + ones;
        }
        return num;
    }
}