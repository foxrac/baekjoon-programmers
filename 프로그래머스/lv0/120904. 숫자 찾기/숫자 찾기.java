class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String a = String.valueOf(num);
        String[] aa = a.split("");
        String b = String.valueOf(k);
        for(int i = 0; i < aa.length ; i++){
            if(aa[i].equals(b)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}