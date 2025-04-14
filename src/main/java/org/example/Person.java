package org.example;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String hobbies;
    public String skills;
    public double weight;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String hobbies, String skills, double weight) {
        this.hobbies = hobbies;
        this.skills = skills;
        this.weight = weight;
    }

    public Person(String firstName, String lastName, int age, String hobbies) {
        this(firstName, lastName, age);
        this.hobbies = hobbies;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    } }


