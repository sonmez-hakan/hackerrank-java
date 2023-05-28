package Introduction;

import java.io.*;

public class JavaLoopsI {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int x = 1; x <= 10; x++) {
            System.out.printf("%d x %d = %d %n", N, x, N * x);
        }

        bufferedReader.close();
    }
}
