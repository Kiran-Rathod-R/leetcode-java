class Solution {
    public int searchInsert(int[] nums, int target) {
        


int n=nums.length;

for(int i=0;i<n;i++){
    if(target==nums[i]){
        return i;
    }

}

for(int j=-1;j<n-1;j++){
    if(target<=nums[j+1]){
        return j+1;
    }

}
return n;
  
}

}
