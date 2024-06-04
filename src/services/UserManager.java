package services;

import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (findUserByName(user.getName()) == null) {
            users.add(user);
        } else {
            System.out.println(user.getName() + " is already existed!");
        }
    }

    public void deleteUser(User user) {
        users.remove(user);
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

    public void displayUsers() {
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge() + ", Creation Date: " + user.getDate());
        }
    }
}
