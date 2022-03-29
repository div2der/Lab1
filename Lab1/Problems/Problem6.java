package Lab1.Problems;

import java.util.*;

public class Problem6 {
    public static int power(int a, int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return a;
        return a * power(a, n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.print(power(a, n));
        scanner.close();
    }
}
