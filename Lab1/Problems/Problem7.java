package Lab1.Problems;

import java.util.*;

public class Problem7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void reverseOrder(int position, int length) {
        if (position > length)
            return;
        int x = scanner.nextInt();
        reverseOrder(position + 1, length);
        System.out.print(x + " ");
    }
    public static void main(String[] args) {
        int n = scanner.nextInt();
        reverseOrder(1, n);
    }
}
