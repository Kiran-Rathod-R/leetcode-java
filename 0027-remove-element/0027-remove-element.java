class Solution {
    public int removeElement(int[] nums, int val) {
        
        int count=0;

for(int i=0;i<nums.length;i++){
    int current=nums[i];
    if(current!=val){
        nums[count]=current;
        count++;



    }
   


}

return count;




    }
}