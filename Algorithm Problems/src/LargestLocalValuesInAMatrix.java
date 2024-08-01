/*You are given an n x n integer matrix grid.

Generate an integer matrix maxLocal of size (n - 2) x (n - 2) such that:

maxLocal[i][j] is equal to the largest value of the 3 x 3 matrix in grid centered around row i + 1 and column j + 1.
In other words, we want to find the largest value in every contiguous 3 x 3 matrix in grid.

Return the generated matrix.*/

public class LargestLocalValuesInAMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int [][] ans = solution(matrix);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }


    }
    public static int[][] solution(int[][] grid){
        int row = grid.length - 2;
        int col = grid[0].length - 2;

        int[][] res = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                res[i][j] = helper(grid, i, j);
            }
        }
        return res;
    }
    private static int helper(int[][] grid, int i, int j) {
        int maxValue = Integer.MIN_VALUE;
        int row = i + 3, col = j + 3;
        for (int p = i; p < row; p++) {
            for (int q = j; q < col; q++) {
                maxValue = Math.max(maxValue, grid[p][q]);
            }
        }
        return maxValue;
    }
}
