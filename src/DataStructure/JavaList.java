package DataStructure;

import java.util.*;

public class JavaList {

    static class Node {
        public int data;
        public Node next = null;

        Node()
        {

        }

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();

        Node tmp = new Node();
        Node root = tmp;

        for (int x = 0; x < size; x++) {
            if (x == 0) {
                tmp.data = scan.nextInt();
            } else {
                tmp.next = new Node(scan.nextInt());
                tmp = tmp.next;
            }
        }

        Node tmp2;
        int query = scan.nextInt(),
                index, number;
        scan.nextLine();
        String s;
        for (int x = 0; x < query; x++) {
            tmp = root;
            s = scan.nextLine();
            if (s.equals("Insert")) {
                index = scan.nextInt();
                number = scan.nextInt();
                if (index == 0) {
                    root = new Node(number);
                    root.next = tmp;
                } else {
                    for (int y = 1; y < index; y++) {
                        tmp = tmp.next;
                    }
                    tmp2 = new Node(number);
                    tmp2.next = tmp.next;
                    tmp.next = tmp2;
                }
            } else {
                index = scan.nextInt();
                if (index == 0) {
                    root = root.next;
                } else {
                    for (int y = 1; y < index; y++) {
                        tmp = tmp.next;
                    }

                    tmp.next = tmp.next.next;
                }
            }
            if (scan.hasNext()) {
                scan.nextLine();
            }
            //write(root);
        }

        write(root);
    }

    public static void write(Node root)
    {
        Node tmp = root;
        while(tmp != null) {
            System.out.print(tmp.data + " ");
            tmp = tmp.next;
        }
        System.out.println();
    }
}