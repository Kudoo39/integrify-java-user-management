package application.services;

import domain.entities.Credentials;
import domain.enums.Role;
import domain.entities.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;
    private int capacity;

    public UserManager(int capacity) {
        this.users = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addUser(User user) {
        boolean isFull = getTotalUsers() < capacity;
        if (!isFull) {
            System.out.println("Maximum users! Cannot add user " + user.getName());
            return;
        }

        boolean isUserUnique = findUserByName(user.getName()) == null;
        if (!isUserUnique) {
            System.out.println(user.getName() + " is already existed!");
            return;
        }

        users.add(user);
    }

    public void deleteUser(User user, User admin) {
        if (authorize(admin)) {
            users.remove(user);
        }
        else {
            System.out.println(user.getName() + " has no admin rights!");
        }
    }

    public int getTotalUsers() {
        return users.size();
    }

    public User findUserByName(String name) {
        for (User user : users) {
            if (name.equals(user.getName())) {
                return user;
            }
        }
        return null;
    }

    public List<User> sortByNameAsc() {
        List<User> sortedUsers = new ArrayList<>(users);
        sortedUsers.sort((User user1, User user2) -> user1.getName().compareTo(user2.getName()));
        return sortedUsers;
    }

    public Boolean login(String username, String password) {
        for (User user : users) {
            Credentials credential = user.getCredentials();
            if (credential.getUsername().equals(username) && credential.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public boolean authorize(User user) {
        if (user.getRole().equals(Role.ADMIN)) {
            return true;
        } else {
            return false;
        }
    }

    public void displayUsers() {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Creation Date: " + user.getDate() + ", Role: " + user.getRole());
        }
    }
}
