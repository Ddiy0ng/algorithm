class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int size = absolutes.length;
        for(int i = 0; i < size; i++){
            if(signs[i] == true)
                answer += absolutes[i];
            else
                answer -= absolutes[i];
        }

        return answer;
    }
}