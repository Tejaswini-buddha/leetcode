class Solution {
    public int findTheWinner(int n, int k) {
        // division -> bottom up approach
        int ans = 0;
        for(int i = 1; i <= n; i++) {
            ans = (ans + k) % i;
        }
        return ans + 1;
    }
}