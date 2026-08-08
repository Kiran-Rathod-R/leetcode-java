class Solution {
    public boolean isPalindrome(int x) {
int reve=0;
int num=x;
if(num<0){
    return false;
}
       while(x!=0){
        
        int digit=x%10;
        reve=reve*10+digit;
        x/=10;


       }

    

       if(reve==num){
        return true;
       }
       else{
        return false;
       }
        
        
    }
}