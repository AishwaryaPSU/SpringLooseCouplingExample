package io.itsagm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CLient {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        JuniorStudent stu = context.getBean("student", JuniorStudent.class);
        stu.cheating();
    }
}
