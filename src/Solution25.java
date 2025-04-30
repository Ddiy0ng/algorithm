class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int size = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0)
                size++;
        }

        if(size == 0){
         int[] answer = {-1};
            return answer;
        }

        int[] answer = new int[size];
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%divisor == 0){
                answer[count] = arr[i];
                count++;
            }
        }
        answer = sort(answer);
        
        return answer;
    }
    public int[] sort(int[] arr){
        for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length-1; i++){
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}