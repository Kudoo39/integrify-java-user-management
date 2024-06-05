package model;

import java.time.LocalDate;

public class User {
    private String name;
    private int age;
    private LocalDate createdDate;

    public User (String name, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.name = name;
        this.age = age;
        this.createdDate = LocalDate.now();
    }

    public User (String name, int age, LocalDate createdDate) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.name = name;
        this.age = age;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDate() {
        return createdDate;
    }
}
