package Lab1.BonusProblems;

import java.util.*;

public class PrefixCompression {
    public static void prefix(String s, String t, int position) {
        if (position == s.length() || position == t.length()) {
            if (s.length() < t.length()) {
                System.out.println(s.length() + " " + s);
                System.out.println(0);
                System.out.println(t.substring(position).length() + " " + t.substring(position));
            }
            else if (t.length() < s.length()) {
                System.out.println(t.length() + " " + t);
                System.out.println(s.substring(position).length() + " " + s.substring(position));
                System.out.println(0);
            }
            else {
                System.out.println(t.length() + " " + t);
                System.out.println(0 + "\n" + 0);
            }
            return;
        }
        if (s.charAt(position) != t.charAt(position)) {
            System.out.println(position + " " + s.substring(0, position));
            System.out.println(s.length() - position + " " + s.substring(position));
            System.out.println(t.length() - position + " " + t.substring(position));
            return;
        }
        prefix(s, t, position + 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        prefix(s, t, 0);
        scanner.close();
    }
}
