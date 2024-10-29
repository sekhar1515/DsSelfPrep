package leetcodeproblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int row[] = new int[r];
        int col[] = new int[c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (row[i] == 1 || col[j] == 1)
                    matrix[i][j] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(matrix);
        String matrixValues = Arrays.stream(matrix)
                .map(row -> Arrays.stream(row)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(", ")))
                .collect(Collectors.joining("\n"));
        System.out.println(matrixValues);
    }
}
