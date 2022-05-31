package br.com.example.cleanarchitecture.domain.factory;

import br.com.example.cleanarchitecture.domain.entity.User;

public interface UserFactory {

    User create(String name, String password);
}
