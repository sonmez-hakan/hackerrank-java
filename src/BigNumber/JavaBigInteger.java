package BigNumber;

import java.util.*;
import java.math.*;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger b1 = new BigInteger(scan.nextLine()),
                b2 = new BigInteger(scan.nextLine());

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
    }
}
