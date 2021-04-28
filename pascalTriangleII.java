class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        if(rowIndex == 0) return arr;
        arr.add(1);
        if(rowIndex == 1) return arr;

        return calculate(arr,1,rowIndex);
    
    }
    public List<Integer> calculate(List<Integer> arr , int curr ,int rowIndex){
        if(curr < rowIndex){
            List<Integer> arr1 = new ArrayList<>();
            arr1.add(1);
            for(int i=0;i<arr.size()-1;i++)
                arr1.add(arr.get(i)+arr.get(i+1));
            arr1.add(1);
            List<Integer> arr2 = calculate(arr1,curr+1,rowIndex);
            return arr2;
        }
        return arr;
    }
}