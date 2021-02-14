class Solution {
    public int romanToInt(String s) {
        int[] intArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'M': intArray[i] = 1000; break;
                case 'D': intArray[i] = 500; break;
                case 'C': intArray[i] = 100; break;
                case 'L': intArray[i] = 50; break;
                case 'X': intArray[i] = 10; break;
                case 'V': intArray[i] = 5; break;
                case 'I': intArray[i] = 1; break;
            }
        }
        int sum = 0;
        for(int i = 0; i < intArray.length - 1; i++){
            if (intArray[i] < intArray[i + 1]){
                sum -= intArray[i];
            }else{
                sum += intArray[i];
            }
        }
        return sum + intArray[intArray.length - 1];
    }
}