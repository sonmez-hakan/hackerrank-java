package DataStructure;

import java.util.*;

public class JavaDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            map.put(num, map.get(num) == null ? 1 : map.get(num) + 1);
            if (i >= m - 1) {
                int size = map.size();
                if (max < size) {
                    max = size;
                }

                int removed = deque.removeFirst();
                int count = map.get(removed);
                if (count > 1) {
                    map.put(removed, count - 1);
                } else {
                    map.remove(removed);
                }
            }
        }

        System.out.println(max);
    }
}
