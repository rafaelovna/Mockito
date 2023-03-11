package com.rafaelovna.mockito.dao;

import com.rafaelovna.mockito.model.User;

import java.util.List;

public interface Dao {

    User getUserByName(String name);
    List<User> findAllUsers();
}
