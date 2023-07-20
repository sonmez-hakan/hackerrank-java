package Advanced;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

import static java.lang.System.in;

class Prime {
    protected ArrayList<Integer> primes;

    public Prime() {
        primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
    }

    public void checkPrime(int... n) {
        StringBuilder s = new StringBuilder("");
        for (int a : n) {
            if (a < 2) {
                continue;
            } else if (primes.contains(a)) {
                s.append(a).append(" ");
            } else {
                if (a % 2 == 0) {
                    continue;
                }

                boolean isPrime = true;
                for (int x = 3, l = (int) Math.sqrt(a) + 1; x <= l; x++) {
                    if (a % x == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    primes.add(a);
                    s.append(a).append(" ");
                }
            }
        }

        System.out.println(s.toString());
    }
}

public class PrimeChecker {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}