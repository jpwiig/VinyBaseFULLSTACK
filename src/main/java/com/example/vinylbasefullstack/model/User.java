package com.example.vinylbasefullstack.model;

public class User {
    private String email;
    private String username;
    private String name;
    private String password;

    public User(String email, String username, String name, String password) {
        this.email = email;
        this.username = username;
        this.name = name;
        this.password = password;
    }
public User(){

}
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
