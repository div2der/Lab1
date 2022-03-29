package Lab1.BonusProblems;

import java.util.*;

public class PascalsTriangle {
    public static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return factorial(n - 1) * n;
    }
    public static void triangle(int row, int column, int k) {
        if (row == k)
            return;
        if (row == 0 || column == 0)
            System.out.print(1);
        else
            System.out.print(factorial(row) / (factorial(column) * factorial(row - column)));
        if (column == row) {
            System.out.println();
            triangle(row + 1, 0, k);
        }
        else {
            System.out.print(" ");
            triangle(row, column + 1, k);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        triangle(0, 0, k);
        scanner.close();
    }
}
