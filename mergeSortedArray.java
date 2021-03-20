class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indx = m+n-1; 
		m = m-1;
		n = n-1;
		while(m>=0 && n>=0){
			nums1[indx--] = nums1[m] > nums2[n] ? nums1[m--] :  nums2[n--];
		}

		if(n>=0){
			while(n>=0)
				nums1[indx--] = nums2[n--];
		}    
    }
}