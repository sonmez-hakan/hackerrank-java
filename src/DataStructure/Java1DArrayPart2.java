package DataStructure;

import java.util.*;

public class Java1DArrayPart2 {

    private static int leap = 0;

    private static int[] game;

    private static int[] went;

    private static int length;

    public static boolean play(int index)
    {
        went[index] = 1;
        if (index + 1 == length && game[length] == 0) {
            return true;
        }

        if (leap > 1) {
            if (index + leap > length) {
                return true;
            }

            if (game[index + leap] == 0 && went[index + leap] == 0 && play(index + leap)) {
                return true;
            }
        }

        if (game[index + 1] == 0 && went[index + 1] == 0 && play(index + 1)) {
            return true;
        }

        if (index - 1 >= 0 && game[index - 1] == 0 && went[index - 1] == 0 && play(index - 1)) {
            return true;
        }

        return false;
    }

    public static boolean canWin(int leap, int[] game) {
        Java1DArrayPart2.went = new int[game.length];
        Java1DArrayPart2.game = game;
        Java1DArrayPart2.leap = leap;
        Java1DArrayPart2.length = game.length - 1;

        return play(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}