import model.User;
import services.UserManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        User johnDoe = new User("John Doe", 25, LocalDate.of(2023, 1, 1));
        User janeDoe = new User("Jane Doe", 30, LocalDate.of(2023, 2, 1));
        User aliceJones = new User("Alice Jones", 28, LocalDate.of(2023, 4, 1));
        User jamesBond = new User("James Bond", 40);
        User katieHolmes = new User("Katie Holmes", 29);
        User lucasScott = new User("Lucas Scott", 23);

        userManager.addUser(johnDoe);
        userManager.addUser(janeDoe);
        userManager.addUser(lucasScott);
        userManager.addUser(aliceJones);
        userManager.addUser(jamesBond);
        userManager.addUser(katieHolmes);

        int totalUser = userManager.getTotalUsers();
        System.out.println(totalUser);

        userManager.displayUsers();
    }
}