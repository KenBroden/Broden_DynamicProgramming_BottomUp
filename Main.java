
public class Main {
    public static void main(String[] args) {
        // First run
        int n1 = 20;
        int[] breakPoints1 = { 2, 8, 10 };

        StringBreak.Result result1 = StringBreak.minCost(n1, breakPoints1);

        System.out.println("\nFirst Run:");
        System.out.println("Minimum cost: " + result1.cost);
        System.out.println("Sequence of breaks: " + result1.sequence + "\n");

        // Second run
        int n2 = 30;
        int[] breakPoints2 = { 2, 5, 9, 12, 18 };

        StringBreak.Result result2 = StringBreak.minCost(n2, breakPoints2);

        System.out.println("\nSecond Run:");
        System.out.println("Minimum cost: " + result2.cost);
        System.out.println("Sequence of breaks: " + result2.sequence + "\n");
    }
}
/*
 * Considering split at k=1 for dp[0][2]: cost=8
 * dp[0][2] = 8
 * Considering split at k=2 for dp[1][3]: cost=8
 * dp[1][3] = 8
 * Considering split at k=3 for dp[2][4]: cost=12
 * dp[2][4] = 12
 * Considering split at k=1 for dp[0][3]: cost=18
 * Considering split at k=2 for dp[0][3]: cost=18
 * dp[0][3] = 18
 * Considering split at k=2 for dp[1][4]: cost=30
 * Considering split at k=3 for dp[1][4]: cost=26
 * dp[1][4] = 26
 * Considering split at k=1 for dp[0][4]: cost=46
 * Considering split at k=2 for dp[0][4]: cost=40
 * Considering split at k=3 for dp[0][4]: cost=38
 * dp[0][4] = 38
 * 
 * First Run:
 * Minimum cost: 38
 * Sequence of breaks: [2, 8, 10]
 * 
 * Considering split at k=1 for dp[0][2]: cost=5
 * dp[0][2] = 5
 * Considering split at k=2 for dp[1][3]: cost=7
 * dp[1][3] = 7
 * Considering split at k=3 for dp[2][4]: cost=7
 * dp[2][4] = 7
 * Considering split at k=4 for dp[3][5]: cost=9
 * dp[3][5] = 9
 * Considering split at k=5 for dp[4][6]: cost=18
 * dp[4][6] = 18
 * Considering split at k=1 for dp[0][3]: cost=16
 * Considering split at k=2 for dp[0][3]: cost=14
 * dp[0][3] = 14
 * Considering split at k=2 for dp[1][4]: cost=17
 * Considering split at k=3 for dp[1][4]: cost=17
 * dp[1][4] = 17
 * Considering split at k=3 for dp[2][5]: cost=22
 * Considering split at k=4 for dp[2][5]: cost=20
 * dp[2][5] = 20
 * Considering split at k=4 for dp[3][6]: cost=39
 * Considering split at k=5 for dp[3][6]: cost=30
 * dp[3][6] = 30
 * Considering split at k=1 for dp[0][4]: cost=29
 * Considering split at k=2 for dp[0][4]: cost=24
 * Considering split at k=3 for dp[0][4]: cost=26
 * dp[0][4] = 24
 * Considering split at k=2 for dp[1][5]: cost=36
 * Considering split at k=3 for dp[1][5]: cost=32
 * Considering split at k=4 for dp[1][5]: cost=33
 * dp[1][5] = 32
 * Considering split at k=3 for dp[2][6]: cost=55
 * Considering split at k=4 for dp[2][6]: cost=50
 * Considering split at k=5 for dp[2][6]: cost=45
 * dp[2][6] = 45
 * Considering split at k=1 for dp[0][5]: cost=50
 * Considering split at k=2 for dp[0][5]: cost=43
 * Considering split at k=3 for dp[0][5]: cost=41
 * Considering split at k=4 for dp[0][5]: cost=42
 * dp[0][5] = 41
 * Considering split at k=2 for dp[1][6]: cost=73
 * Considering split at k=3 for dp[1][6]: cost=65
 * Considering split at k=4 for dp[1][6]: cost=63
 * Considering split at k=5 for dp[1][6]: cost=60
 * dp[1][6] = 60
 * Considering split at k=1 for dp[0][6]: cost=90
 * Considering split at k=2 for dp[0][6]: cost=80
 * Considering split at k=3 for dp[0][6]: cost=74
 * Considering split at k=4 for dp[0][6]: cost=72
 * Considering split at k=5 for dp[0][6]: cost=71
 * dp[0][6] = 71
 * 
 * Second Run:
 * Minimum cost: 71
 * Sequence of breaks: [2, 5, 9, 12, 18]
 * 
 */