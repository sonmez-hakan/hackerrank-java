package Advanced;

import java.util.*;
import java.lang.reflect.*;

class Student
{
    public void test()
    {
        System.out.println("test");
    }

    public void retest()
    {
        System.out.println("retest");
    }
}

public class JavaReflectionAttributes {

    public static void main(String[] args){
        Class student = new Student().getClass();
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method method: methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }
}