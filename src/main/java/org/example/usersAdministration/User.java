package org.example.usersAdministration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    private String name;
    private String userID;
    private String username;
    private String userPassword;


    public User(String name, String userID) {
        this.name = name;
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    private static Map<String, String> userInfoLogin = new HashMap<>();

    public static void registerUser(String userLogin, String userPassword){
        if (!userInfoLogin.containsKey(userLogin) || userInfoLogin .equals(null)){
            userInfoLogin.put(userLogin, userPassword);
            System.out.println("User added successfully");
        }else {
            System.out.println("User name  already taken. Try another one");
        }
    }
    public static void login(){
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
    private static boolean newUser(String username, String password) {
        return userInfoLogin.containsKey(username);

    }
}
