package br.com.example.cleanarchitecture.domain.output;

import br.com.example.cleanarchitecture.domain.model.UserResponseModel;

public interface UserPresenter {

    UserResponseModel prepareSuccessView(UserResponseModel userResponseModel);

    UserResponseModel prepareFailView(String error);
}
