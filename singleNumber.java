class Solution {
  public int singleNumber(int[] nums) {
    HashMap<Integer, Integer> hashMap = new HashMap<>();
    for (int i : nums) {
      hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
    }
    for (int i : nums) {
      if (hashMap.get(i) == 1) {
        return i;
      }
    }
    return 0;
  }
}