//Find the sqrt of x. !!Very inefficient
class Solution {
    public int mySqrt(int x) {
        if(x==0) return 0;
        if(x==1) return 1;
        for(long i = 2; i<=x;i++){
            if(i*i == x) return (int)i;
            if(i*i > x) return (int)i-1;
        }
        return 0;
    }
}
