package com.Shop.Project.Eccormerce.service.interf;

import com.Shop.Project.Eccormerce.dto.LoginRequest;
import com.Shop.Project.Eccormerce.dto.Response;
import com.Shop.Project.Eccormerce.dto.UserDto;
import com.Shop.Project.Eccormerce.model.User;

public interface UserService {
    Response registerUser(UserDto registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    User getLoginUser();
    Response getUserInfoAndOrderHistory();
}
