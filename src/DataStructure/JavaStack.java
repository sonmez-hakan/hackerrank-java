package DataStructure;

import java.util.*;

class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack;

        String input;
        char c;
        boolean result = true;
        while (sc.hasNext()) {
            input = sc.next();
            result = true;
            stack = new Stack<>();
            for (int x = 0, l = input.length(); x < l; x++) {
                c = input.charAt(x);
                if (c == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = false;
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        result = false;
                        break;
                    }
                } else if (c == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        result = false;
                        break;
                    }
                } else {
                    stack.push(c);
                }
            }

            //System.out.println(result + " " + stack.isEmpty());
            if (result && stack.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}