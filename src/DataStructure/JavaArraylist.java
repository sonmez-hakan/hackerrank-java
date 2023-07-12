package DataStructure;

import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(), query, number;
        List<List<Integer>> numbers = new ArrayList<>();
        for (int x = 0; x < count; x++) {
            numbers.add(new ArrayList<>());
            query = scan.nextInt();
            for (int y = 0; y < query; y++) {
                number = scan.nextInt();
                numbers.get(x).add(number);
            }
        }

        count = scan.nextInt();
        List<Integer> tmp;
        for (int x = 0; x < count; x++) {
            query = scan.nextInt();
            number = scan.nextInt();
            tmp = numbers.get(query - 1);
            if (tmp.size() > number - 1) {
                System.out.println(tmp.get(number - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}