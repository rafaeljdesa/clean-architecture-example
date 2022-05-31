package br.com.example.cleanarchitecture.domain.model;

public class UserResponseModel {

    public UserResponseModel(String name, String creationTime) {
        this.name = name;
        this.creationTime = creationTime;
    }

    private String name;
    private String creationTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
}
