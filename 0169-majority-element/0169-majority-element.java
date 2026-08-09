class Solution {
    public int majorityElement(int[] nums) {
        

int n=nums.length;

Arrays.sort(nums);

int maxCount=1;
int count=1;
int ans=nums[0];

for(int i=1;i<n;i++){

    if(nums[i]==nums[i-1]){
        count++;
    }else{count=1;}

    if(count>maxCount){
        maxCount=count;
        ans=nums[i];
    }

}

if(maxCount>n/2){
    return ans;
}

return -1;


    }
}