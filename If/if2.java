
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] count = new int[7];

        count[a]++;
        count[b]++;
        count[c]++;
        count[d]++;

        int four = 0;
        int three = 0;
        int pair1 = 0;
        int pair2 = 0;
        int one1 = 0;
        int one2 = 0;

        for (int i = 1; i <= 6; i++) {
            if (count[i] == 4) {
                four = i;
            } else if (count[i] == 3) {
                three = i;
            } else if (count[i] == 2) {
                if (pair1 == 0) {
                    pair1 = i;
                } else {
                    pair2 = i;
                }
            } else if (count[i] == 1) {
                if (one1 == 0) {
                    one1 = i;
                } else {
                    one2 = i;
                }
            }
        }

        if (four != 0) {
            return 1111 * four;
        }

        if (three != 0) {
            int q = one1;
            return (10 * three + q) * (10 * three + q);
        }

        if (pair1 != 0 && pair2 != 0) {
            return (pair1 + pair2) * Math.abs(pair1 - pair2);
        }

        if (pair1 != 0) {
            return one1 * one2;
        }

        return Math.min(Math.min(a, b), Math.min(c, d));
    }
}