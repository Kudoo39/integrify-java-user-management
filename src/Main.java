import model.Credentials;
import model.User;
import services.UserManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager(5);

        Credentials johnDoeCre = new Credentials("john", "123");
        User johnDoe = new User("John Doe", 25, LocalDate.of(2023, 1, 1), johnDoeCre);

        Credentials aliceJonesCre = new Credentials("alice", "123");
        User aliceJones = new User("Alice Jones", 28, LocalDate.of(2023, 4, 1), aliceJonesCre);

        Credentials katieHolmesCre = new Credentials("katie", "123");
        User katieHolmes = new User("Katie Holmes", 29, katieHolmesCre);

        Credentials lucasScottCre = new Credentials("katie", "123");
        User lucasScott = new User("Lucas Scott", 23, lucasScottCre);

        userManager.addUser(johnDoe);
        userManager.addUser(lucasScott);
        userManager.addUser(aliceJones);
        userManager.addUser(katieHolmes);

        int totalUser = userManager.getTotalUsers();
        System.out.println("Total users: " + totalUser);

        userManager.displayUsers();
    }
}