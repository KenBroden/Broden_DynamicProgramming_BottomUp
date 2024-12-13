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
    First Run:
    Minimum cost: 38
    Sequence of breaks: [2, 8, 10]

    Subproblems:
    Length | Positions | Cost | Sequence
    [0][1] = [0, 2] | 0 | []
    [0][2] = [0, 2, 8] | 8 | [2]
    [0][3] = [0, 2, 8, 10] | 18 | [2, 8]
    [0][4] = [0, 2, 8, 10, 20] | 38 | [2, 8, 10]
    [1][2] = [2, 8] | 0 | []
    [1][3] = [2, 8, 10] | 10 | [8]
    [1][4] = [2, 8, 10, 20] | 30 | [8, 10]
    [2][3] = [8, 10] | 0 | []
    [2][4] = [8, 10, 20] | 20 | [10]
    [3][4] = [10, 20] | 0 | []

    Second Run:
    Minimum cost: 71
    Sequence of breaks: [2, 5, 9, 12, 18]

    Subproblems:
    Length | Positions | Cost | Sequence
    [0][1] = [0, 2] | 0 | []
    [0][2] = [0, 2, 5] | 5 | [2]
    [0][3] = [0, 2, 5, 9] | 14 | [2, 5]
    [0][4] = [0, 2, 5, 9, 12] | 24 | [2, 5, 9]
    [0][5] = [0, 2, 5, 9, 12, 18] | 41 | [2, 5, 9, 12]
    [0][6] = [0, 2, 5, 9, 12, 18, 30] | 71 | [2, 5, 9, 12, 18]
    [1][2] = [2, 5] | 0 | []
    [1][3] = [2, 5, 9] | 9 | [5]
    [1][4] = [2, 5, 9, 12] | 19 | [5, 9]
    [1][5] = [2, 5, 9, 12, 18] | 36 | [5, 9, 12]
    [1][6] = [2, 5, 9, 12, 18, 30] | 66 | [5, 9, 12, 18]
    [2][3] = [5, 9] | 0 | []
    [2][4] = [5, 9, 12] | 12 | [9]
    [2][5] = [5, 9, 12, 18] | 27 | [9, 12]
    [2][6] = [5, 9, 12, 18, 30] | 57 | [9, 12, 18]
    [3][4] = [9, 12] | 0 | []
    [3][5] = [9, 12, 18] | 18 | [12]
    [3][6] = [9, 12, 18, 30] | 48 | [12, 18]
    [4][5] = [12, 18] | 0 | []
    [4][6] = [12, 18, 30] | 30 | [18]
    [5][6] = [18, 30] | 0 | []
```

## DP Table

### First Run

- **Minimum cost**: 38
- **Sequence of breaks**: [2, 8, 10]

#### DP Table 1

| i\j   | 0   | 1   | 2   | 3   | 4   |
|-------|-----|-----|-----|-----|-----|
| **0** | 0   | 0   | 8   | 18  | 38  |
| **1** |     | 0   | 0   | 10  | 30  |
| **2** |     |     | 0   | 0   | 20  |
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
