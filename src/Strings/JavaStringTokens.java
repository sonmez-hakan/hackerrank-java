package Strings;

import java.util.*;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] subs = s.split("[!._@,'? ]");
        int length = 0;
        for (String a: subs) {
            if (!a.equals("")) {
                length++;
            }
        }

        System.out.println(length);
        for(String a: subs) {
            if (!a.equals("")) {
                System.out.println(a);
            }
        }

        scan.close();
    }
}
