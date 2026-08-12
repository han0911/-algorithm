class Solution {
    public int solution(int a, int b) {
        String str1 = "" + a + b;
        int num1 = Integer.parseInt(str1);
        

        String str2 = "" + b + a;
        int num2 = Integer.parseInt(str2);

        if (num2 > num1) {
            return num2;
        } else {
            return num1;
        }
    }
}