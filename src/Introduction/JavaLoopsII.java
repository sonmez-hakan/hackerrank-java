package Introduction;

import java.util.*;
import java.lang.Math;

public class JavaLoopsII {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        for (int x = 0; x < count; x++) {
            int start = scan.nextInt();
            int step = scan.nextInt();
            int limit = scan.nextInt();
            for (int y = 0; y < limit; y++) {
                start += Math.pow(2, y) * step;
                System.out.printf("%d ", start);
            }
            System.out.printf("%n");
        }
    }
}
