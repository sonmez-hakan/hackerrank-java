package DataStructure;

import java.util.*;

public class JavaSubarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] arr = new int[count];
        for (int x = 0; x < count; x++) {
            arr[x] = scan.nextInt();
        }

        int result = 0, sum = 0;
        for (int x = 1; x <= count; x++) {
            for (int y = 0; y <= count - x; y++) {
                sum = 0;
                for (int z = y; z < y + x; z++) {
                    sum += arr[z];
                }
                result += sum < 0 ? 1 : 0;
            }
        }

        System.out.println(result);
    }
}
