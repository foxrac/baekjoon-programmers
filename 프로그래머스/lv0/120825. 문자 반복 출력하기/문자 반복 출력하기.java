class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] a = my_string.split("");
        for(int i = 0 ; i < a.length ;i++){
            for(int j = 0 ; j < n ; j++ ){
                answer += a[i];
            }
        }
        return answer;
    }
}