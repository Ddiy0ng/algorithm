class Solution {
    public int[] solution(long n) {
        String num = Long.toString(n);
        int size = num.length();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[-i-1] = Integer.parseInt(num.substring(i, i+1));
        }
        return answer;
    }
}