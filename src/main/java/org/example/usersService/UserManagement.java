package org.example.usersService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserManagement {
    private Map<String, User> users;
    private Map<String, String> userInfoLogin;

    public UserManagement(Map<String, User> users) {
        this.users = users;
    }

    public void addUser(User user) {
        users.put(user.getId(), user);
        System.out.println("User added.");
    }

    public void deleteUser(User user) {
        if (users.remove(user.getId()) == null)
            throw new RuntimeException("User not found.");
        System.out.println("User deleted.");
    }

    public void updateUser(User user) {
        if (users.containsKey(user.getId()))
        throw new RuntimeException("User not found.");
        System.out.println("User updated");
    }
    public void displayUsers(User user) {
        System.out.println("User List:");
        users.values().forEach(user1 -> System.out.println("Username: " + user.getUsername() + "Password: " + user.getPassword()));
    }

    public void registerUser(String userLogin, String userPassword){
        if (!userInfoLogin.containsKey(userLogin) || userInfoLogin .equals(null)){
            userInfoLogin.put(userLogin, userPassword);
            System.out.println("User added successfully");
        }else {
            System.out.println("User name  already taken. Try another one");
        }
    }
    public void login(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre with your user name");
        String username = sc.nextLine();

        System.out.println("Enter with your password: ");
        String password = sc.nextLine();

        if (newUser (username, password)){
            System.out.println("Valid login");
        }else {
            System.out.println("Username or password invalid ");
        }
    }
    private boolean newUser(String username, String password) {
        return userInfoLogin.containsKey(username);

    }
}




