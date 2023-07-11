package BigNumber;

import java.io.*;
import java.math.*;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();

        System.out.println(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
    }
}
