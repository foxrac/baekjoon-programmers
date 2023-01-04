class Solution {
    public String solution(String s) {
        String answer = "";
        String[] ss = s.split(" ");
        String max = ss[0];
        String min = ss[0];
        for(String num : ss){
            if(Integer.valueOf(num) > Integer.valueOf(max)){
                max = num;   
            }
            if(Integer.valueOf(num) < Integer.valueOf(min)){
                min = num;   
            }
        }
        return answer+= min + " " + max;
    }
}