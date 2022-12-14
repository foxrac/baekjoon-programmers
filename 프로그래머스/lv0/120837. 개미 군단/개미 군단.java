class Solution {
    public int solution(int hp) {
        int answer = 0;
        int attack[] = new int[] {5,3,1}; 
        
        for(int i=0;i<attack.length;i++){
            answer += hp/attack[i];
            hp= hp%attack[i];            
        }
        return answer;
    }
}