class Solution21 {
    public boolean solution(int x) {
        int number = x;
        boolean answer = false;
        int size = Integer.toString(x).length();
        int sum = 0;

        for(int i = size-1; i > 0; i--){
            int a = number/(int)Math.pow(10, i);
            sum += a;
            int l = (int)Math.pow(10, i);
            number -= l * a;
           }
        sum += number;
        System.out.println(sum);
        if(x % sum == 0)
            answer = true;
        return answer;
    }
}