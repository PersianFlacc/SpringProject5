package org.example.project5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println("-----------------");

        System.out.println(person.getSurname());
        System.out.println(person.getName());
        System.out.println(person.getAge());

        System.out.println("-----------------");

        Dog dog = context.getBean("dogBean", Dog.class);
        System.out.println(dog.getName());

        context.close();
    }
}
