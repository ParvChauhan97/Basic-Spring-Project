package com.system.user.UserSystem.User;

public class User {
    private int id;
    private String name;
    private String Email;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    User(int id, String name, String Email) {
        this.id = id;
        this.name = name;
        this.Email = Email;
    }
}
