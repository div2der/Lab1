package Lab1.BonusProblems;

import java.util.*;

public class StringOPermute {
    public static String permute(String s, int position) {
        if (position == s.length())
            return "";
        return "" + s.charAt(position + 1) + s.charAt(position) + permute(s, position + 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[t];
        for (int i = 0; i < t; ++ i)
            s[i] = scanner.nextLine();
        for (int i = 0; i < t; ++ i)
            System.out.println(permute(s[i], 0));
        scanner.close();
    }
}
