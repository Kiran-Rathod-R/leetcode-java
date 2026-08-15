class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

int zero=0;
int one=0;
int two=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }

        for(int i=0;i<zero;i++){
            nums[i]=0;

        }
        for(int j=0;j<one;j++){
            nums[zero+j]=1;
        }
        for(int k=0;k<two;k++){
            nums[zero+one+k]=2;
        }
    }
}