package com.taras.exhibition.service.controller;

import com.taras.exhibition.service.controller.assembler.UserAssembler;
import com.taras.exhibition.service.controller.model.UserModel;
import com.taras.exhibition.service.dto.UserDto;
import com.taras.exhibition.service.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserAssembler userAssembler;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{email}")
    public UserModel getUser(@PathVariable String email) {
        UserDto user = userService.getUser(email);
        log.info("Get user with email " + email);
        return userAssembler.toModel(user);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserModel createUser(@Valid @RequestBody UserDto userDto) {
        UserDto user = userService.createUser(userDto);
        log.info("Create user:{} ", userDto);
        return userAssembler.toModel(user);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{email}")
    public UserModel updateUser(@PathVariable String email, @RequestBody UserDto userDto) {
        UserDto user = userService.updateUser(email, userDto);
        log.info("Update user:{} with email " + email, userDto);
        return userAssembler.toModel(user);
    }

    @RequestMapping(value = "/{email}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteUser(@PathVariable String email) {

        log.info("Delete user with email: " + email);
        userService.deleteUser(email);
        return ResponseEntity.noContent().build();
    }

}
