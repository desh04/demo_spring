package com.desh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Create the context

        // Dev obj = new Dev();
        Dev obj = (Dev) context.getBean("dev");
        obj.build();
        // obj.setAge(19);

        System.out.println(obj.getAge());

    }
}
