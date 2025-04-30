class Solution27 {
    public String solution(String phone_number) {
        int size = phone_number.length();
        String[] str = phone_number.split("");
        for(int i = 0; i < size - 4; i++)
            str[i] = "*";
        phone_number = String.join("", str);
        return phone_number;
    }
}