package Lab1.Problems;

import java.util.*;

public class Problem9 {
    public static int cnk(int n, int k) {
        if (n == 0)
            return 0;
        if (k == 0 || n == k)
            return 1;
        return cnk(n - 1, k - 1) + cnk(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(cnk(n, k));
        scanner.close();
    }
}
