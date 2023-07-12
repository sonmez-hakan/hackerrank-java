package DataStructure;

import java.util.*;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt(), query = scan.nextInt();
        BitSet[] bitSets = {new BitSet(length), new BitSet(length)};

        String s;
        int b1, b2;
        for (int x = 0; x < query; x++) {
            s = scan.next();
            b1 = scan.nextInt();
            b2 = scan.nextInt();
            switch (s) {
                case "AND" -> bitSets[b1 - 1].and(bitSets[b2 - 1]);
                case "OR" -> bitSets[b1 - 1].or(bitSets[b2 - 1]);
                case "XOR" -> bitSets[b1 - 1].xor(bitSets[b2 - 1]);
                case "SET" -> bitSets[b1 - 1].set(b2);
                case "FLIP" -> bitSets[b1 - 1].flip(b2);
            }

            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
    }
}