package com.taras.exhibition.service.controller;

import com.taras.exhibition.service.api.UserApi;
import com.taras.exhibition.service.controller.assembler.UserAssembler;
import com.taras.exhibition.service.controller.model.UserModel;
import com.taras.exhibition.service.dto.UserDto;
import com.taras.exhibition.service.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {

    private final UserService userService;
    private final UserAssembler userAssembler;

    @Override
    public UserModel getUser(String email) {
        UserDto user = userService.getUser(email);
        log.info("Get user with email " + email);
        return userAssembler.toModel(user);
    }

    @Override
    public UserModel createUser(UserDto userDto) {
        UserDto user = userService.createUser(userDto);
        log.info("Create user:{} ", userDto);
        return userAssembler.toModel(user);
    }

    @Override
    public UserModel updateUser(String email, UserDto userDto) {
        UserDto user = userService.updateUser(email, userDto);
        log.info("Update user:{} with email " + email, userDto);
        return userAssembler.toModel(user);
    }

    @Override
    public ResponseEntity<Void> deleteUser(String email) {

        log.info("Delete user with email: " + email);
        userService.deleteUser(email);
        return ResponseEntity.noContent().build();
    }

}
