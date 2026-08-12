import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list.length;
        int last = num_list[n - 1];     
        int second = num_list[n - 2];    

        int newVal;
        if (last > second) {
            newVal = last - second;
        } else {
            newVal = last * 2;
        }

        int[] result = Arrays.copyOf(num_list, n + 1);
        result[n] = newVal;

        return result;
    }
}