package Introduction;

import java.util.*;

public class JavaDataTypes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        long number;

        for (int x = 0, query = scan.nextInt(); x < query; x++) {
            s = scan.next();
            try {
                number = Long.parseLong(s);
                System.out.println(s + " can be fitted in:");
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }

                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }

                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }

                System.out.println("* long");

            } catch (Exception excpetion) {
                System.out.println(s + " can't be fitted anywhere.");
            }
        }
    }
}
