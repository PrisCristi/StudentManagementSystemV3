package org.example.usersAdministration;

public class UserManagement {
    private static String[] usernames = new String[10];
    private static String[] passwords = new String[10];
    private static int totalUsers = 0;

    public UserManagement(String[] usernames, String[] passwords, int totalUsers) {
        this.usernames = usernames;
        this.passwords = passwords;
        this.totalUsers = totalUsers;
    }
    public String[] getUsernames() {
        return usernames;
    }
    public void setUsernames(String[] usernames) {
        this.usernames = usernames;
    }
    public String[] getPasswords() {
        return passwords;
    }
    public void setPasswords(String[] passwords) {
        this.passwords = passwords;
    }

    public int getTotalUsers() {
        return totalUsers;
    }

    public void setTotalUsers(int totalUsers) {
        this.totalUsers = totalUsers;
    }
    public static void addUser(String username, String password) {
        if (totalUsers < usernames.length) {
            usernames[totalUsers] = "Priscila";
            passwords[totalUsers] = "12345";
            totalUsers++;
            System.out.println("User added.");
        } else {
            System.out.println("No more users can be added.");
        }
    }

    public static void deleteUser(String username) {
        for (int i = 0; i < totalUsers; i++) {
            if (usernames[i].equals(username)) {
                usernames[i] = usernames[totalUsers - 1];
                passwords[i] = passwords[totalUsers - 1];
                totalUsers--;
                System.out.println("User deleted.");
                return;
            }
        }
        System.out.println("User not found.");
    }

    public static void updateUser(String username, String newPassword) {
        for (int i = 0; i < totalUsers; i++) {
            if (usernames[i].equals(username)) {
                passwords[i] = newPassword;
                System.out.println("Password was updated.");
                return;
            }
        }
        System.out.println("User not found.");
    }
    public static void displayUsers() {
        System.out.println("User List:");
        for (int i = 0; i < totalUsers; i++) {
            System.out.println("Username: " + usernames[i] + ", Password: " + passwords[i]);
        }
        System.out.println();
    }
}


