package com.taras.exhibition.service.repository;

import com.taras.exhibition.service.model.User;

public interface UserRepository {
    User getUser(String email);

    User createUser(User user);

    User updateUser(String email, User user);

    void deleteUser(String email);
}
