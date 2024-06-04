# User Management

In this assignment, you will create a simple user management system that allows adding, removing, and viewing users. Additionally, you will use built-in data structures like `Queue` and `Stack` to handle user tasks.

## Requirements

## Level 1

1. Create a class `User`, which has name (readonly), age, and creation date, which are private. Age cannot be negative. Provide the following features:
    - Constructor to take parameters of name, age, and creation date (optional, if not set, it will be the current date).

2. Create a class `UserManager` with the following properties and methods:
    - A collection to store users, which is private. Initially, this will be an empty collection.
    - Methods to add/delete one user to/from the collection. Do not allow adding users with the same name to the manager.
    - Method `getTotalUsers` to compute the total number of users in the manager.
    - Method `findUserByName` to find a user by name.
    - Method `sortByNameAsc` to get the sorted collection by name in ascending order.

```java
// users example - You do not need to follow exactly the same
User johnDoe = new User("John Doe", 25, LocalDate.of(2023, 1, 1));
User janeDoe = new User("Jane Doe", 30, LocalDate.of(2023, 2, 1));
User bobSmith = new User("Bob Smith", 20, LocalDate.of(2023, 3, 1));
User aliceJones = new User("Alice Jones", 28, LocalDate.of(2023, 4, 1));
User charlieBrown = new User("Charlie Brown", 22, LocalDate.of(2023, 5, 1));
User emilyDavis = new User("Emily Davis", 26, LocalDate.of(2023, 6, 1));
User frankMiller = new User("Frank Miller", 32, LocalDate.of(2023, 7, 1));
User graceHopper = new User("Grace Hopper", 35, LocalDate.of(2023, 8, 1));
User hankWilliams = new User("Hank Williams", 27, LocalDate.of(2023, 9, 1));
User isabellaClark = new User("Isabella Clark", 24, LocalDate.of(2023, 10, 1));
User jamesBond = new User("James Bond", 40);
User katieHolmes = new User("Katie Holmes", 29);
User lucasScott = new User("Lucas Scott", 23);
User miaWallace = new User("Mia Wallace", 31);
User noahBennett = new User("Noah Bennett", 33);
```

## Level 2

Class `UserManager` should have the following features:
- Maximum capacity, which is the total number of users allowed in the manager, and the constructor should also take an integer value as the maximum capacity of the manager.
- Modify the add method to not exceed the capacity.

## Level 3

Add authentication tasks to the `UserManager` class:
- Create a `Credentials` class to store username and password for each user.
- Add a `login` method to the `UserManager` class that takes a username and password, checks if they match a stored user's credentials, and returns a boolean indicating success or failure.

## Level 4

Add authorization tasks to the `UserManager` class:
1. Create a `Role` enum with roles such as `ADMIN` and `USER`.
2. Modify the `User` class to include a role.
3. Add methods in `UserManager` to handle role-based access control (RBAC):
    - Method `authorize` that checks if a user has a specific role before performing certain actions (e.g., only `ADMIN` can add or remove users).
    - You can have another classes like Products
      - USER can view a product
      - ADMIN can mutate the product
4. Use a `Queue` to manage pending user registration requests and process them in a FIFO order.