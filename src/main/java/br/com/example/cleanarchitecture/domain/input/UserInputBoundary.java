package br.com.example.cleanarchitecture.domain.input;

import br.com.example.cleanarchitecture.domain.model.UserRequestModel;
import br.com.example.cleanarchitecture.domain.model.UserResponseModel;

public interface UserInputBoundary {

    UserResponseModel create(UserRequestModel userRequestModel);
}
