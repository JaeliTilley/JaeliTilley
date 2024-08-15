public class PascalTriangle {

    public int pascal(int n, int k) {

        if (k == 0 || k == n) {
            return 1;
        }
        return pascal(n - 1, k - 1) + pascal(n - 1, k);
    }
    public void printPascal(int n) {
        for (int i = 0; i < n; i++) {
            printPascalRow(i, 0);
            System.out.println();
        }
    }


    private void printPascalRow(int row, int col) {
        if (col <= row) {
            System.out.print(pascal(row, col) + " ");
            printPascalRow(row, col + 1);
        }
    }

    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int n = 5;
        pt.printPascal(n);
    }
}