class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int min = 0;
        for(int i = 0 ; i < array.length ; i++){
            max = Math.max(array[i],max);
        }
        for(int j = 0 ; j < array.length; j++){
            if(array[j]==max){
                min = j;
            }
        }
        int[] answer = {max,min};
        return answer;
    }
}