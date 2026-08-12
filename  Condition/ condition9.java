class Solution {
    public int solution(int[] num_list) {
        int answer1 = 0;
        int answer2 = 1;
        
        for(int i = 0;i<=num_list.length-1;i++){
            answer1 += num_list[i];
            answer2 *= num_list[i];
        }
        if((answer1*answer1) > answer2){
            return 1;
        }else{
            return 0;
        }
    }
}