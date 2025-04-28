public class Solution13 {
    public int solution(int n) {
            
        String num = Integer.toString(n);
        int size = num.length();
        int answer = 0;
        
        for(int i = 0; i < size; i++){
            int number = Integer.parseInt(num.substring(i, i+1));
            answer += number;
        }
        
        return answer;
    }
}