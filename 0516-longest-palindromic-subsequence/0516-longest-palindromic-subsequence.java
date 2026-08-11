// class Solution {
//     Integer[][] dp;
//     public int longestPalindromeSubseq(String s) {
        // int n = s.length();
        // if (n == 0) 
        // return 0;

        
        // int[][] dp = new int[n][n];

        
        // for (int i = 0; i < n; i++)
        // for (int len = 2; len <= n; len++) {
        //     for (int i = 0; i + len - 1 < n; i++) {
        //         int j = i + len - 1;
        //         if (s.charAt(i) == s.charAt(j)) {
                    
        //             dp[i][j] = 2 + ( (i + 1 <= j - 1) ? dp[i + 1][j - 1] : 0 );
        //         } else {
        //             // else drop one end and take the max
        //             dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
        //         }
        //     }
    //     }

    //     return dp[0][n - 1];
    // }

//     int i =0;
//     int n=s.length();
//     dp = new Integer[n][n];
//     return helper(s, i, n-1);
// }
// int helper(String s, int i, int j)
// {
//     if(i>j) return 0;
//     if(i==j) return 1;
//     if(dp[i][j] != null) return dp[i][j];

//     if(s.charAt(i)==s.charAt(j)) return dp[i][j]=2 + helper(s, i+1, j-1);

//     return dp[i][j]= Math.max(helper(s, i, j-1), helper(s, i+1, j, dp);)
// }
// }


class Solution {

    Integer[][] dp;

    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        dp = new Integer[n][n];
        return helper(s, 0, n - 1);
    }

    int helper(String s, int i, int j) {

        if (i > j) return 0;
        if (i == j) return 1;

        if (dp[i][j] != null) return dp[i][j];

        if (s.charAt(i) == s.charAt(j))
            return dp[i][j] = 2 + helper(s, i + 1, j - 1);

        return dp[i][j] = Math.max(
            helper(s, i, j - 1),
            helper(s, i + 1, j)
        );
    }
}
