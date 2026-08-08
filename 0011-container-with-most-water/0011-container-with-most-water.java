class Solution {
    public int maxArea(int[] height) {

        int n = height.length;

        int maxVolume = 0;

       int str=0;
       int rear=n-1;

       while(str<rear){
            int width=rear-str;
            int h=Math.min(height[str],height[rear]);
            int volume=width*h;

            if(volume>maxVolume){
maxVolume=volume;
            }

            if(height[str]<height[rear]){
                str++;
            }else{
                rear--;
            }



       }

       return maxVolume;
    }

}