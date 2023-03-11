package com.rafaelovna.mockito.dao.impl;

import com.rafaelovna.mockito.dao.Dao;
import com.rafaelovna.mockito.model.User;
import java.util.ArrayList;
import java.util.List;


public class UserDaoImpl implements Dao {

    private final List<User> users = new ArrayList<>();

    public UserDaoImpl() {
        User user1 = new User("Ivan", "ivan", "ivan@mail.ru");
        User user2 = new User("Mariya", "mariya", "mariya@mail.ru");
        User user3 = new User("Katya", "katya", "katya@mail.ru");
        User user4 = new User("Fedor", "fedor", "fedor@mail.ru");
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }


}