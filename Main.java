import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] breakPoints = { 2, 8, 10 };

        StringBreak.Result result = StringBreak.minCost(n, breakPoints);

        System.out.println("Minimum cost: " + result.cost);
        System.out.println("Sequence of breaks: " + result.sequence);

        System.out.println("\nSubproblems:");
        System.out.println("Length | Positions | Cost");
        for (int i = 0; i < result.breakPoints.length + 2; i++) {
            for (int j = i + 1; j < breakPoints.length + 2; j++) {
                System.out.printf("[%d][%d] = %s\n", i, j, Arrays.toString(Arrays.copyOfRange(breakPoints, i, j)),
                        result.cost);
            }
        }
    }
}