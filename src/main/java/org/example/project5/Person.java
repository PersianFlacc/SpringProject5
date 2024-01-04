package org.example.project5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {

    //@Value("Ostapenko")
    @Value("${person.surname}")
    private String surname;
    //@Value("Artem")
    @Value("${person.name}")
    private String name;
    //@Value("22")
    @Value("${person.age}")
    private int age;
    private Pet pet;


    public Person() {
        System.out.println("Person bean is created");
    }

    @Autowired
    @Qualifier("dogBean")
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, My lovely pet");
        pet.say();
    }
}
