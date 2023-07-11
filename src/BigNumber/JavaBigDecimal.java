package BigNumber;

import java.math.BigDecimal;
import java.util.*;

class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        BigDecimal[] bigDecimals = new BigDecimal[n];
        BigDecimal bigTmp;
        String tmp;
        for (int x = 0; x < n; x++) {
            bigDecimals[x] = new BigDecimal(s[x]);
        }

        for (int x = 0; x < n - 1; x++) {
            for (int y = 0; y < n - x - 1; y++) {
                if (bigDecimals[y].compareTo(bigDecimals[y + 1]) < 0) {

                    bigTmp = bigDecimals[y];
                    bigDecimals[y] = bigDecimals[y + 1];
                    bigDecimals[y + 1] = bigTmp;

                    tmp = s[y];
                    s[y] = s[y + 1];
                    s[y + 1] = tmp;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}