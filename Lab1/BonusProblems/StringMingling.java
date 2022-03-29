package Lab1.BonusProblems;

import java.util.*;

public class StringMingling {
    public static String merge(String s, String t, int position) {
        if (position == s.length())
            return "";
        return "" + s.charAt(position) + t.charAt(position) + merge(s, t, position + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        System.out.println(merge(s, t, 0));
        scanner.close();
    }
}
