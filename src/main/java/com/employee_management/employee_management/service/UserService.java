package com.employee_management.employee_management.service;

import com.employee_management.employee_management.dto.UserDto;
import com.employee_management.employee_management.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}
