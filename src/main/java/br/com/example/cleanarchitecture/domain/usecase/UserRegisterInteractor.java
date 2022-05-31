package br.com.example.cleanarchitecture.domain.usecase;

import br.com.example.cleanarchitecture.domain.entity.User;
import br.com.example.cleanarchitecture.domain.factory.UserFactory;
import br.com.example.cleanarchitecture.domain.input.UserInputBoundary;
import br.com.example.cleanarchitecture.domain.model.UserDsRequestModel;
import br.com.example.cleanarchitecture.domain.model.UserRequestModel;
import br.com.example.cleanarchitecture.domain.model.UserResponseModel;
import br.com.example.cleanarchitecture.domain.output.UserDsRegisterGateway;
import br.com.example.cleanarchitecture.domain.output.UserPresenter;

import java.time.LocalDateTime;

public class UserRegisterInteractor implements UserInputBoundary {

    private final UserDsRegisterGateway userDsGateway;
    private final UserPresenter userPresenter;
    private final UserFactory userFactory;

    public UserRegisterInteractor(UserDsRegisterGateway userDsGateway, UserPresenter userPresenter, UserFactory userFactory) {
        this.userDsGateway = userDsGateway;
        this.userPresenter = userPresenter;
        this.userFactory = userFactory;
    }

    @Override
    public UserResponseModel create(UserRequestModel requestModel) {
        if (userDsGateway.existsByName(requestModel.getName())) {
            return userPresenter.prepareFailView("User already exists.");
        }
        User user = userFactory.create(requestModel.getName(), requestModel.getPassword());
        if (!user.passwordIsValid()) {
            return userPresenter.prepareFailView("User password must have more than 5 characters.");
        }
        LocalDateTime now = LocalDateTime.now();
        UserDsRequestModel userDsModel = new UserDsRequestModel(user.getName(), user.getPassword(), now);

        userDsGateway.save(userDsModel);

        UserResponseModel accountResponseModel = new UserResponseModel(user.getName(), now.toString());
        return userPresenter.prepareSuccessView(accountResponseModel);
    }
}
