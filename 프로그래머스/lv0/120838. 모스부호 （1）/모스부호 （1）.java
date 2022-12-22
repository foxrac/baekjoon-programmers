class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] a = letter.split(" ");
        String[] b = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] c = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < b.length ; j++){
                if(a[i].equals(b[j])){
                    answer+=c[j];
                }
            }
            
        }
        return answer;
    }
}