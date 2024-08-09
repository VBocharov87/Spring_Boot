package org.boot.service;

import org.boot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUpdateUser(User user);

    User getUser(int id);

    void deleteUser(int id);

}
