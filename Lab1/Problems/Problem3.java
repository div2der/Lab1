package Lab1.Problems;

import java.util.*;

public class Problem3 {
    public static boolean prime(int n) {
        for (int i = 2; i < n; ++ i)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1 || n == 0)
            System.out.print("Neither prime, nor composite");
        else
            System.out.println(prime(n) ? "Prime" : "Composite");
        scanner.close();
    }
}
