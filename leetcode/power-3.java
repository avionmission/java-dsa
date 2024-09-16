class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while(n>1){
            int remainder = n %3;
            if(remainder>0) return false;
            else n/=3;
        }
        return true;
    }
}
