# Broden_DynamicProgramming_BottomUp

*Lab completed by Ken Broden*

## Overview

The `StringBreak.java` program implements a bottom-up dynamic programming solution to find the minimum cost of breaking a string at specified positions. The program calculates the optimal sequence of breaks and the associated costs for both the main problem and its subproblems.

## How to Run

To run the program, execute the `Main.java` file. The `Main` class contains two runs with different inputs:

1. First run with string length `n = 20` and break points `{2, 8, 10}`.
2. Second run with string length `n = 30` and break points `{2, 5, 9, 12, 18}`.

The program will output the minimum cost, the sequence of breaks, and the details of the subproblems for each run.

## Results

```shell
    Considering split at k=1 for dp[0][2]: cost=8
    dp[0][2] = 8
    Considering split at k=2 for dp[1][3]: cost=8
    dp[1][3] = 8
    Considering split at k=3 for dp[2][4]: cost=12
    dp[2][4] = 12
    Considering split at k=1 for dp[0][3]: cost=18
    Considering split at k=2 for dp[0][3]: cost=18
    dp[0][3] = 18
    Considering split at k=2 for dp[1][4]: cost=30
    Considering split at k=3 for dp[1][4]: cost=26
    dp[1][4] = 26
    Considering split at k=1 for dp[0][4]: cost=46
    Considering split at k=2 for dp[0][4]: cost=40
    Considering split at k=3 for dp[0][4]: cost=38
    dp[0][4] = 38

    First Run:
    Minimum cost: 38
    Sequence of breaks: [2, 8, 10]

    Considering split at k=1 for dp[0][2]: cost=5
    dp[0][2] = 5
    Considering split at k=2 for dp[1][3]: cost=7
    dp[1][3] = 7
    Considering split at k=3 for dp[2][4]: cost=7
    dp[2][4] = 7
    Considering split at k=4 for dp[3][5]: cost=9
    dp[3][5] = 9
    Considering split at k=5 for dp[4][6]: cost=18
    dp[4][6] = 18
    Considering split at k=1 for dp[0][3]: cost=16
    Considering split at k=2 for dp[0][3]: cost=14
    dp[0][3] = 14
    Considering split at k=2 for dp[1][4]: cost=17
    Considering split at k=3 for dp[1][4]: cost=17
    dp[1][4] = 17
    Considering split at k=3 for dp[2][5]: cost=22
    Considering split at k=4 for dp[2][5]: cost=20
    dp[2][5] = 20
    Considering split at k=4 for dp[3][6]: cost=39
    Considering split at k=5 for dp[3][6]: cost=30
    dp[3][6] = 30
    Considering split at k=1 for dp[0][4]: cost=29
    Considering split at k=2 for dp[0][4]: cost=24
    Considering split at k=3 for dp[0][4]: cost=26
    dp[0][4] = 24
    Considering split at k=2 for dp[1][5]: cost=36
    Considering split at k=3 for dp[1][5]: cost=32
    Considering split at k=4 for dp[1][5]: cost=33
    dp[1][5] = 32
    Considering split at k=3 for dp[2][6]: cost=55
    Considering split at k=4 for dp[2][6]: cost=50
    Considering split at k=5 for dp[2][6]: cost=45
    dp[2][6] = 45
    Considering split at k=1 for dp[0][5]: cost=50
    Considering split at k=2 for dp[0][5]: cost=43
    Considering split at k=3 for dp[0][5]: cost=41
    Considering split at k=4 for dp[0][5]: cost=42
    dp[0][5] = 41
    Considering split at k=2 for dp[1][6]: cost=73
    Considering split at k=3 for dp[1][6]: cost=65
    Considering split at k=4 for dp[1][6]: cost=63
    Considering split at k=5 for dp[1][6]: cost=60
    dp[1][6] = 60
    Considering split at k=1 for dp[0][6]: cost=90
    Considering split at k=2 for dp[0][6]: cost=80
    Considering split at k=3 for dp[0][6]: cost=74
    Considering split at k=4 for dp[0][6]: cost=72
    Considering split at k=5 for dp[0][6]: cost=71
    dp[0][6] = 71

    Second Run:
    Minimum cost: 71
    Sequence of breaks: [2, 5, 9, 12, 18]
    
```

## DP Table

### First Run

- **Minimum cost**: 38
- **Sequence of breaks**: [2, 8, 10]

#### DP Table 1

| i\j   | 0   | 1   | 2   | 3   | 4   |
|-------|-----|-----|-----|-----|-----|
| **0** | 0   | 0   | 8   | 18  | 38  |
| **1** |     | 0   | 0   | 8   | 26  |
| **2** |     |     | 0   | 0   | 12  |
| **3** |     |     |     | 0   | 0   |
| **4** |     |     |     |     | 0   |

### Second Run

- **Minimum cost**: 71
- **Sequence of breaks**: [2, 5, 9, 12, 18]

#### DP Table 2

| i\j   | 0   | 1   | 2   | 3   | 4   | 5   | 6   |
|-------|-----|-----|-----|-----|-----|-----|-----|
| **0** | 0   | 0   | 5   | 14  | 24  | 41  | 71  |
| **1** |     | 0   | 0   | 9   | 19  | 36  | 66  |
| **2** |     |     | 0   | 0   | 12  | 27  | 57  |
| **3** |     |     |     | 0   | 0   | 18  | 48  |
| **4** |     |     |     |     | 0   | 0   | 30  |
| **5** |     |     |     |     |     | 0   | 0   |
| **6** |     |     |     |     |     |     | 0   |

## Runtime Complexity

The runtime complexity of the `StringBreak.java` program is \(O(m^3)\), where \(m\) is the number of break points plus 2 (for the start and end points). This is due to the nested loops used to fill the dynamic programming (DP) table. Specifically:

- The outer loop runs for \(O(m)\) iterations.
- The inner loops also run for \(O(m)\) iterations.
- Within the innermost loop, the cost calculation takes \(O(1)\) time.

Thus, the overall complexity for filling the DP table is \(O(m^3)\). The reconstruction of the sequence takes \(O(m)\) time, but this is dominated by the \(O(m^3)\) complexity of the DP table filling step.
