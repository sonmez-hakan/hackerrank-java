package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;
import java.util.PriorityQueue;

class Student3 {
    final private int id;
    final private String name;
    final private double cgpa;

    public Student3(int id, String name, double cgpa) {
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Checker3 implements Comparator<Student3> {
    @Override
    public int compare(Student3 s1, Student3 s2) {
        if (s1.getCGPA() < s2.getCGPA()) {
            return 1;
        }

        if (s1.getCGPA() == s2.getCGPA()) {
            int comp = s1.getName().compareTo(s2.getName());
            if (comp == 0) {
                return s1.getID() > s2.getID() ? 1 : -1;
            }

            return comp;
        }

        return -1;
    }
}

class Priorities {
    public List<Student3> getStudents(List<String> events) {
        PriorityQueue<Student3> queue = new PriorityQueue<>(new Checker3());
        for (String s : events) {

            if ("SERVED".equals(s)) {
                queue.poll();
            } else {
                String[] parts = s.split(" ");
                queue.add(new Student3(
                        Integer.parseInt(parts[3]),
                        parts[1],
                        Double.parseDouble(parts[2])
                ));
            }
        }

        List<Student3> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }

        return students;
    }
}

public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student3> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student3 st : students) {
                System.out.println(st.getName());
            }
        }
    }
}