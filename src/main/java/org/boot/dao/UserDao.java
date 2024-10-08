package org.boot.dao;

import org.boot.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUpdateUser(User user);

    User getUser(int id);

    void deleteUser(int id);

}
