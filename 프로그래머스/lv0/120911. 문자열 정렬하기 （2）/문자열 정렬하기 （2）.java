import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        my_string.trim();
        my_string = my_string.toLowerCase();
        char[] arr = my_string.toCharArray();
        for(int i = 0 ; i < arr.length; i ++){
            for(int j = i; j < arr.length; ++j){
                if(arr[i] > arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(char c : arr){
            answer += c;
        }
        return answer;
    }
}