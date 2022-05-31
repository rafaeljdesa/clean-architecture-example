package br.com.example.cleanarchitecture.domain.factory;

import br.com.example.cleanarchitecture.domain.entity.CommonUser;
import br.com.example.cleanarchitecture.domain.entity.User;

public class CommonUserFactory implements UserFactory {

    @Override
    public User create(String name, String password) {
        return new CommonUser(name, password);
    }
}
