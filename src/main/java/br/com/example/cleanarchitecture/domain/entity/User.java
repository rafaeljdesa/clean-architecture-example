package br.com.example.cleanarchitecture.domain.entity;

public interface User {

    boolean passwordIsValid();

    String getName();

    String getPassword();
}
