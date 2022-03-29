package Lab1.Problems;

import java.util.*;

public class Problem2 {
    public static double average(int[] a, int position) {
        if (position == a.length - 1)
            return a[position] / (a.length * 1.0);
        return (a[position] / (a.length * 1.0)) + average(a, position + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++ i)
            a[i] = scanner.nextInt();
        System.out.println(average(a, 0));
        scanner.close();
    }
}
