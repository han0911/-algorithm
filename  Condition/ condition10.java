class Solution {
    public int solution(int[] num_list) {
        String odd = "";
        String even = "";
        for(int i = 0;i<=num_list.length-1;i++){
            if(num_list[i] % 2==0){
                even += num_list[i];
            }else if (num_list[i] % 2==1){
                odd += num_list[i];
            }
        }
        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
}