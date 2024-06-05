package services;

import model.User;

public class Product {
    private UserManager userManager;

    public Product(UserManager userManager) {
        this.userManager = userManager;
    }

    public void mutateProduct(User user) {
        if (userManager.authorize(user)) {
            System.out.println(user.getName() + " is able to mutate products!");
        } else {
            System.out.println(user.getName() + " has no admin rights!");
        }
    }

    public void viewProduct() {
        System.out.println("Review product detail!");
    }
}
