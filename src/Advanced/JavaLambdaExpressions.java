package Advanced;

import java.io.*;
import java.util.*;

interface PerformOperation {
    boolean check(int a);
}

class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    public PerformOperation isOdd() {
        return new PerformOperation() {
            @Override
            public boolean check(int a) {
                return a % 2 == 1;
            }
        };
    }

    public PerformOperation isPrime() {
        return new PerformOperation() {

            @Override
            public boolean check(int a) {
                if (a == 2) {
                    return true;
                }

                if (a == 1 || a % 2 == 0) {
                    return false;
                }

                for (int x = 3; x * x <= a; x += 2) {
                    if (a % x == 0) {
                        return false;
                    }
                }

                return true;
            }
        };
    }

    public PerformOperation isPalindrome() {
        return new PerformOperation() {

            @Override
            public boolean check(int a) {
                String s = String.valueOf(a);
                return s.equals(new StringBuilder(s).reverse().toString());
            }
        };
    }
}

public class JavaLambdaExpressions {
    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T-- > 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}
