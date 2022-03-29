package Lab1.BonusProblems;

import java.util.*;

public class StringReductions {
    public static String reduct(String s, int position, int[] counter) {
        if (position == s.length())
            return "";
        char current = s.charAt(position);
        if (counter[current - 'a'] == 1)
            return "" + reduct(s, position + 1, counter);
        counter[current - 'a']++;
        return "" + current + reduct(s, position + 1, counter); 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] counter = new int[26];
        System.out.print(reduct(s, 0, counter));
        scanner.close();
    }
}