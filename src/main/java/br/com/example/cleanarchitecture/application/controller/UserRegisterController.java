package br.com.example.cleanarchitecture.application.controller;

import br.com.example.cleanarchitecture.domain.input.UserInputBoundary;
import br.com.example.cleanarchitecture.domain.model.UserRequestModel;
import br.com.example.cleanarchitecture.domain.model.UserResponseModel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRegisterController {

    final UserInputBoundary userInputBoundary;

    public UserRegisterController(UserInputBoundary userInputBoundary) {
        this.userInputBoundary = userInputBoundary;
    }

    public UserResponseModel create(@RequestBody UserRequestModel userRequestModel) {
        return userInputBoundary.create(userRequestModel);
    }
}
