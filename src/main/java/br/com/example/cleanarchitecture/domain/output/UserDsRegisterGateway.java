package br.com.example.cleanarchitecture.domain.output;

import br.com.example.cleanarchitecture.domain.model.UserDsRequestModel;

// Data source gateway
public interface UserDsRegisterGateway {

    boolean existsByName(String name);

    void save(UserDsRequestModel userDsRequestModel);
}
