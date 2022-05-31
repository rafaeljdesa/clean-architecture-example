package br.com.example.cleanarchitecture.domain.model;

public class UserRequestModel {

    public UserRequestModel(String name, String password) {
        this.name = name;
        this.password = password;
    }

    private String name;
    private String password;

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