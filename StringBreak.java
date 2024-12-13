import java.util.*;

// Break up a string using bottom up Dynamic Programming

public class StringBreak {

    public static class Result {
        int cost;
        List<Integer> sequence;
        int[] breakPoints;

        Result(int cost, List<Integer> sequence, int[] breakPoints) {
            this.cost = cost;
            this.sequence = sequence;
            this.breakPoints = breakPoints;
        }
    }

    public static Result minCost(int n, int[] breakPoints) {
        // Extend the breakPoints array to include the start and end points
        int[] bp = new int[breakPoints.length + 2];
        bp[0] = 0;
        bp[bp.length - 1] = n;
        for (int i = 0; i < breakPoints.length; i++) {
            bp[i + 1] = breakPoints[i];
        }

        // Initialize the DP table
        int m = bp.length;
        int[][] dp = new int[m][m];
        int[][] split = new int[m][m]; // Reconstruct the sequence of breaks

        // Bottom up DP loop
        // Time complexity: O(m^3)
        for (int length = 2; length < m; length++) {
            for (int i = 0; i < m - length; i++) {
                int j = i + length;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    int cost = dp[i][k] + dp[k][j] + bp[j] - bp[i];
                    System.out.printf("Considering split at k=%d for dp[%d][%d]: cost=%d\n", k, i, j, cost);
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                        split[i][j] = k;
                    }
                }
                System.out.printf("dp[%d][%d] = %d\n", i, j, dp[i][j]);
            }
        }

        // Reconstruction
        List<Integer> sequence = new ArrayList<>();
        reconstruct(bp, split, 0, m - 1, sequence);
        Collections.sort(sequence); // Ensure the sequence is in order
        return new Result(dp[0][m - 1], sequence, bp);
    }

    // Reconstruct the sequence of breaks
    // Time complexity: O(n)
    private static void reconstruct(int[] bp, int[][] split, int i, int j, List<Integer> sequence) {
        if (i + 1 == j) {
            return;
        }
        int k = split[i][j];
        sequence.add(bp[k]);
        reconstruct(bp, split, i, k, sequence);
        reconstruct(bp, split, k, j, sequence);
    }
}