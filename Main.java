import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // First run
        int n1 = 20;
        int[] breakPoints1 = { 2, 8, 10 };

        StringBreak.Result result1 = StringBreak.minCost(n1, breakPoints1);

        System.out.println("First Run:");
        System.out.println("Minimum cost: " + result1.cost);
        System.out.println("Sequence of breaks: " + result1.sequence);

        System.out.println("\nSubproblems:");
        System.out.println("Length | Positions | Cost | Sequence");
        for (int i = 0; i < result1.breakPoints.length - 1; i++) {
            for (int j = i + 1; j < result1.breakPoints.length; j++) {
                int[] subBreakPoints = Arrays.copyOfRange(result1.breakPoints, i, j + 1);
                StringBreak.Result subResult = StringBreak.minCost(subBreakPoints[subBreakPoints.length - 1],
                        Arrays.copyOfRange(subBreakPoints, 1, subBreakPoints.length - 1));
                System.out.printf("[%d][%d] = %s | %d | %s\n", i, j, Arrays.toString(subBreakPoints), subResult.cost,
                        subResult.sequence);
            }
        }

        // Second run
        int n2 = 30;
        int[] breakPoints2 = { 2, 5, 9, 12, 18 };

        StringBreak.Result result2 = StringBreak.minCost(n2, breakPoints2);

        System.out.println("\nSecond Run:");
        System.out.println("Minimum cost: " + result2.cost);
        System.out.println("Sequence of breaks: " + result2.sequence);

        System.out.println("\nSubproblems:");
        System.out.println("Length | Positions | Cost | Sequence");
        for (int i = 0; i < result2.breakPoints.length - 1; i++) {
            for (int j = i + 1; j < result2.breakPoints.length; j++) {
                int[] subBreakPoints = Arrays.copyOfRange(result2.breakPoints, i, j + 1);
                StringBreak.Result subResult = StringBreak.minCost(subBreakPoints[subBreakPoints.length - 1],
                        Arrays.copyOfRange(subBreakPoints, 1, subBreakPoints.length - 1));
                System.out.printf("[%d][%d] = %s | %d | %s\n", i, j, Arrays.toString(subBreakPoints), subResult.cost,
                        subResult.sequence);
            }
        }
    }
    /*
     * Output:
     * 
     * First Run:
     * Minimum cost: 38
     * Sequence of breaks: [2, 8, 10]
     * 
     * Subproblems:
     * Length | Positions | Cost | Sequence
     * [0][1] = [0, 2] | 0 | []
     * [0][2] = [0, 2, 8] | 8 | [2]
     * [0][3] = [0, 2, 8, 10] | 18 | [2, 8]
     * [0][4] = [0, 2, 8, 10, 20] | 38 | [2, 8, 10]
     * [1][2] = [2, 8] | 0 | []
     * [1][3] = [2, 8, 10] | 10 | [8]
     * [1][4] = [2, 8, 10, 20] | 30 | [8, 10]
     * [2][3] = [8, 10] | 0 | []
     * [2][4] = [8, 10, 20] | 20 | [10]
     * [3][4] = [10, 20] | 0 | []
     * 
     * Second Run:
     * Minimum cost: 71
     * Sequence of breaks: [2, 5, 9, 12, 18]
     * 
     * Subproblems:
     * Length | Positions | Cost | Sequence
     * [0][1] = [0, 2] | 0 | []
     * [0][2] = [0, 2, 5] | 5 | [2]
     * [0][3] = [0, 2, 5, 9] | 14 | [2, 5]
     * [0][4] = [0, 2, 5, 9, 12] | 24 | [2, 5, 9]
     * [0][5] = [0, 2, 5, 9, 12, 18] | 41 | [2, 5, 9, 12]
     * [0][6] = [0, 2, 5, 9, 12, 18, 30] | 71 | [2, 5, 9, 12, 18]
     * [1][2] = [2, 5] | 0 | []
     * [1][3] = [2, 5, 9] | 9 | [5]
     * [1][4] = [2, 5, 9, 12] | 19 | [5, 9]
     * [1][5] = [2, 5, 9, 12, 18] | 36 | [5, 9, 12]
     * [1][6] = [2, 5, 9, 12, 18, 30] | 66 | [5, 9, 12, 18]
     * [2][3] = [5, 9] | 0 | []
     * [2][4] = [5, 9, 12] | 12 | [9]
     * [2][5] = [5, 9, 12, 18] | 27 | [9, 12]
     * [2][6] = [5, 9, 12, 18, 30] | 57 | [9, 12, 18]
     * [3][4] = [9, 12] | 0 | []
     * [3][5] = [9, 12, 18] | 18 | [12]
     * [3][6] = [9, 12, 18, 30] | 48 | [12, 18]
     * [4][5] = [12, 18] | 0 | []
     * [4][6] = [12, 18, 30] | 30 | [18]
     * [5][6] = [18, 30] | 0 | []
     */
}