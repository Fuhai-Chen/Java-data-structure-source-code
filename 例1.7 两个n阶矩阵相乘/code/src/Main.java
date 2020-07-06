public class Main {
    public static void squareMult (int[][] a, int[][] b, int n){
        int[][] c = new int[][];
        for (int i = 0; i < n; i ++)
            for (int j = 0;j < n; j ++) {
                c[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
    }
}
