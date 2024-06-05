package model;

import java.time.LocalDate;

public class User {
    private String name;
    private int age;
    private LocalDate createdDate;
    private Credentials credentials;
    private Role role;

    public User (String name, int age, Credentials credentials, Role role) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.name = name;
        this.age = age;
        this.createdDate = LocalDate.now();
        this.credentials = credentials;
        this.role = role;
    }

    public User (String name, int age, LocalDate createdDate, Credentials credentials, Role role) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        }
        this.name = name;
        this.age = age;
        this.createdDate = createdDate;
        this.credentials = credentials;
        this.role = role;
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

    public Credentials getCredentials() {
        return credentials;
    }

    public Role getRole() {
        return role;
    }
}
