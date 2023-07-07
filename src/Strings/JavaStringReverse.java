package Strings;

import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        String r = new StringBuilder(a).reverse().toString();

        System.out.println(a.compareTo(r) == 0 ? "Yes" : "No");
    }
}
