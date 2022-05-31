package br.com.example.cleanarchitecture.application.data;

import br.com.example.cleanarchitecture.application.repository.JpaUserRepository;
import br.com.example.cleanarchitecture.domain.model.UserDsRequestModel;
import br.com.example.cleanarchitecture.domain.output.UserDsRegisterGateway;

public class UserJpaGateway implements UserDsRegisterGateway {

    private JpaUserRepository repository;

    @Override
    public boolean existsByName(String name) {
        return repository.existsById(name);
    }

    @Override
    public void save(UserDsRequestModel userDsRequestModel) {
        UserDataMapper userDataMapper = new UserDataMapper(
                userDsRequestModel.getName(),
                userDsRequestModel.getPassword(),
                userDsRequestModel.getCreationTime()
        );
        repository.save(userDataMapper);
    }
}
