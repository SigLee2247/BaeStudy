class Solution {
    public int solution(int a, int b) {
while (true)
        {
            if(b % 2 == 0)
                b /= 2;
            else if(b % 5 == 0)
                b /= 5;
            else
                break;
        }

        return a % b == 0 ? 1 : 2;
    }
}