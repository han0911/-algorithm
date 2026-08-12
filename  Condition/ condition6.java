class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder(); 
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = 1 - mode; 
            } else {
               
                if (mode == 0 && i % 2 == 0) {
                    answer.append(current);
                } else if (mode == 1 && i % 2 == 1) {
                    answer.append(current);
                }
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}