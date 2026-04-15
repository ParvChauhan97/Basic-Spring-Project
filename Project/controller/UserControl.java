package com.system.user.UserSystem.Controler;

public  class UserControl {
    int id;
    String name;
    String email;

    public UserControl(){}

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    UserControl(int id, String name, String Email) {
        this.id = id;
        this.name = name;
        this.email = Email;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

}
