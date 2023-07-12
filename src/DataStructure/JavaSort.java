package DataStructure;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Checker2 checker = new Checker2();
        Collections.sort(studentList, checker);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}

class Checker2 implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        }

        if (s1.getCgpa() == s2.getCgpa()) {
            int comp = s1.getFname().compareTo(s2.getFname());
            if (comp == 0) {
                return s1.getId() > s2.getId() ? 1 : -1;
            }

            return comp;
        }

        return -1;
    }
}