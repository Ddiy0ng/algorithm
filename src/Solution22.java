class Solution22 {
    public long solution(int a, int b) {
        long answer = 0;
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        for(long i = a; i <= b; i++){
            answer += i;
        }
        return answer;

    }
}