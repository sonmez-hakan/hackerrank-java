package Advanced;

import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.math.BigInteger;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(s.getBytes());
        byte[] digest = md.digest();
        BigInteger bigInt = new BigInteger(1, digest);
        String hashtext = bigInt.toString(16);
        System.out.println(hashtext);
    }
}