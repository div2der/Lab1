package Lab1.BonusProblems;

import java.util.*;

public class SequenceFullOfColors {
    public static boolean sequence(String s, int position, int red, int green, int yellow, int blue) {
        if (red - green < -1 || red - green > 1 || yellow - blue < -1 || yellow - blue > 1)
            return false;
        int currentRed = s.charAt(position) == 'R' ? 1 : 0;
        int currentGreen = s.charAt(position) == 'G' ? 1 : 0;
        int currentYellow = s.charAt(position) == 'Y' ? 1 : 0;
        int currentBlue = s.charAt(position) == 'B' ? 1 : 0;
        if (position == s.length() - 1)
            return red + currentRed == green + currentGreen && yellow + currentYellow == blue + currentBlue;
        return sequence(s, position + 1, red + currentRed, green + currentGreen, yellow + currentYellow, blue + currentBlue);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String[] s = new String[t];
        for (int i = 0; i < t; ++ i)
            s[i] = scanner.nextLine();
        for (int i = 0; i < t; ++ i)
            System.out.println(sequence(s[i], 0, 0, 0, 0, 0) ? "True" : "False");
        scanner.close();
    }
}