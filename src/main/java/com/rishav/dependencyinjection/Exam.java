package com.rishav.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/beans.xml");
        Student rishav = context.getBean("student",Student.class);
        rishav.displayStudentInfo();

        Student akash = context.getBean("akash",Student.class);
        akash.displayStudentInfo();
    }
}
