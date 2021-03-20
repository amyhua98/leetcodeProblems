class Solution {
    public int singleNumber(int[] nums) {
        HashMap hashMap = new HashMap();
        for(int i=0; i<nums.length; i++){
             if(hashMap.containsKey(nums[i])){
                hashMap.remove(nums[i]);
            } else {
                 hashMap.put(nums[i], i);
             }
        }
        
        for(int i=0; i<nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
}