package org.example.project5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    //@Value("${dog.name}")
    @Value("Sharik")
    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    public String getName() {
        return name;
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }
}
