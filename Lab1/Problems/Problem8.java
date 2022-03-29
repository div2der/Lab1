package Lab1.Problems;

import java.util.*;

public class Problem8 {
    public static boolean containsDigit(String s, int position) {
        if (position == s.length() - 1)
            return s.charAt(position) >= '0' && s.charAt(position) <= '9';
        boolean current = s.charAt(position) >= '0' && s.charAt(position) <= '9';
        return (containsDigit(s, position + 1) ? 1 : 0) < (current ? 1 : 0) ? containsDigit(s, position + 1) : current;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(containsDigit(s, 0) ? "Yes" : "No");
        scanner.close();
    }
}
