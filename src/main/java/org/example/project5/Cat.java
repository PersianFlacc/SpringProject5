package org.example.project5;

import org.springframework.stereotype.Component;

@Component("catBean")
public class Cat implements Pet{

    private String name;

    public Cat() {
        System.out.println("Cat bean is created");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
