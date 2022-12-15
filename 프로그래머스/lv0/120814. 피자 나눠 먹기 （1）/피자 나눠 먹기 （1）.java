class Solution {
    public int solution(int n) {
        double a = n/7;
        double b = n%7;
        if(b==0){
            return (int)a;
        }else{
            return (int)Math.floor(a) + 1;    
        }
    }
}