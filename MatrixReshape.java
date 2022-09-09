package 力扣刷题;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) return mat;
        int[][] result = new int[r][c];
        int h = 0, l = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[h][l];
                l++;
                if (l == mat[0].length) {
                    l = 0;
                    h++;
                }
            }
        }

        return result;
    }

}
