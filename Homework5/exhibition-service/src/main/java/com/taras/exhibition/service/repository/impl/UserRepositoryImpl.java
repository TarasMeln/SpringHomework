package com.taras.exhibition.service.repository.impl;

import com.taras.exhibition.service.exception.UserNotFoundException;
import com.taras.exhibition.service.model.User;
import com.taras.exhibition.service.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserRepositoryImpl implements UserRepository {
    private List<User> list = new ArrayList<>();

    @Override
    public User getUser(String email) {
        return list.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElseThrow(UserNotFoundException::new);
    }

    @Override
    public User createUser(User user) {
        list.add(user);
        return user;
    }

    @Override
    public User updateUser(String email, User user) {
        boolean isDeleted = list.removeIf(u -> u.getEmail().equals(email));
        if (isDeleted) {
            list.add(user);
        } else {
            throw new UserNotFoundException();
        }
        return user;
    }

    @Override
    public void deleteUser(String email) {
        list.removeIf(user -> user.getEmail().equals(email));
    }
}
