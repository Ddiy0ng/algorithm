class Solution23 {
    public int solution(int num) {
        int count = 0;
        double number = num;
        if(number == 1)
            return 0;
        while(number != 1){
            if(count > 500)
                return -1;
            if(number % 2 == 0){
                number /= 2;
            }
            else{
                number = (number * 3) + 1;             
            }  
                count++;    
        }
        return count;
    }
}