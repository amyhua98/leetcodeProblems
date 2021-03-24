class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        String newS = new String(sArray);
        String newT = new String(tArray);
        return newS.equals(newT);
    }
}