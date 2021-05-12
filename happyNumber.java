class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>();
        while(n != 1 ) {
            int current = n;
            int sum = 0;
            
            while(current != 0){
                int rem = current % 10;
                sum = sum + (rem * rem);
                current = current / 10;
            }
            
            if (seen.contains(sum)){
                return false;
            }
            
            n = sum;
            seen.add(n);
        }
        return true;
    }
}