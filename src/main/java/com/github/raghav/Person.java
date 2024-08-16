package com.github.raghav;

public class Person {
    String name = null;
    int age = 0;
    String city = null;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person : " + name + " [" + age + "] - " + city;
    }
}
