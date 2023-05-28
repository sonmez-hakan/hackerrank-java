package Introduction;

import java.util.*;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int i;
        System.out.println("================================");
        for (int x = 0; x < 3; x++) {
            s = scan.next();
            i = scan.nextInt();
            System.out.printf("%-14s %03d %n", s, i);
        }
        System.out.println("================================");
    }
}
