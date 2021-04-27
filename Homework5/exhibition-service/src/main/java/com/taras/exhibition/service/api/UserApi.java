package com.taras.exhibition.service.api;

import com.taras.exhibition.service.controller.model.UserModel;
import com.taras.exhibition.service.dto.UserDto;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@Api(tags = "User management API")
@RequestMapping("/api/v1/users")
public interface UserApi {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{email}")
    UserModel getUser(@PathVariable String email);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    UserModel createUser(@Valid @RequestBody UserDto userDto);

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{email}")
    UserModel updateUser(@PathVariable String email, @RequestBody UserDto userDto);

    @RequestMapping(value = "/{email}", method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteUser(@PathVariable String email);
}
