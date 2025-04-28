class Solution15 {
    public int solution(int n) {
        int answer = n - 1;
        for(int i = 2; i < answer; i++){
            if(n % i == 1){
                answer = i;
                break;
            }    
        }
        return answer;
    }
}