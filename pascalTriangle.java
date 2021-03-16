class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<List<Integer>>();
        for (int i = 1; i < numRows + 1; i++){
            List<Integer> row = new ArrayList<Integer>();
            if (i == 1){
                row.add(1);
            }
            else if (i == 2){
                row.add(1);
                row.add(1);
            }
            else{
                List<Integer> dummy = pascal.get(i-2);
                row.add(1);
                for (int j = 1; j < dummy.size(); j++){
                    int sum = dummy.get(j-1) + dummy.get(j);
                    row.add(sum);
                }
                row.add(1);
                
            }
            pascal.add(row);
        }
        return pascal;
    }
}