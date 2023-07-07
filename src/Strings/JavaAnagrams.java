package Strings;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        char[] cha = a.toLowerCase().toCharArray(),
                chb = b.toLowerCase().toCharArray();

        if (cha.length != chb.length) {
            return false;
        }

        java.util.Arrays.sort(cha);
        java.util.Arrays.sort(chb);

        for (int x = 0, l = cha.length; x < l; x++) {
            if (cha[x] != chb[x]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
