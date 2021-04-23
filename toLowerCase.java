class Solution {
    public String toLowerCase(String str) {
        StringBuilder lower = new StringBuilder();
        for (char c: str.toCharArray()){
            if (c >= 65 && c < 97)
                lower.append((char)(c + 32));
            else
                lower.append(c);
        }
        return lower.toString();
    }
}
