package DataStructure;

import java.io.*;
import java.util.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();

        int max = Integer.MIN_VALUE, sum;
        for (int x = 0; x < 4; x++) {
            for (int y = 0; y < 4; y++) {
                sum = arr.get(x).get(y) + arr.get(x).get(y + 1) + arr.get(x).get(y + 2)
                        + arr.get(x + 1).get(y + 1)
                        + arr.get(x + 2).get(y) + arr.get(x + 2).get(y + 1) + arr.get(x + 2).get(y + 2);

                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}