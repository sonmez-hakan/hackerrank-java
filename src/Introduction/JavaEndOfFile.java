package Introduction;

import java.util.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        int page = 1;
        Scanner scan = new Scanner(System.in);
        String s;
        while (scan.hasNext()) {
            s = scan.nextLine();
            System.out.println(page + " " + s);
            page++;
        }
    }
}
