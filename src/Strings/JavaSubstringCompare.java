package Strings;

import java.util.Scanner;

public class JavaSubstringCompare {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        java.util.List<String> substrings = new java.util.ArrayList<String>();

        for (int x = 0, l = s.length() - (k - 1); x < l; x++) {
            substrings.add(s.substring(x, x + k));
        }

        java.util.Collections.sort(substrings);

        smallest = substrings.get(0);
        largest = substrings.get(substrings.size() - 1);

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
