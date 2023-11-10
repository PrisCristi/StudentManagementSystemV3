package org.example.usersAdministration;

public class UserRoles extends User{
    private String roleName;

    public UserRoles(String name, String userID, String roleName) {
        super(name, userID);
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
