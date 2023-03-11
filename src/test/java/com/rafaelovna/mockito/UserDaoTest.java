package com.rafaelovna.mockito;

import com.rafaelovna.mockito.dao.impl.UserDaoImpl;
import com.rafaelovna.mockito.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDaoTest {

    private final UserDaoImpl userDao = new UserDaoImpl();

    public static final String NEW_NAME = "Viki";
    public static final String CORRECT_NAME = "Ivan";

    User out = new User("Ivan", "ivan", "ivan@mail.ru");


    @Test
    public void shouldGetUserByName() {
        Assertions.assertEquals(out, userDao.getUserByName(CORRECT_NAME));
        Assertions.assertNotNull(userDao.getUserByName(CORRECT_NAME));
    }

    @Test
    public void shouldUsersNameIsNotInTheList() {
        Assertions.assertNull(userDao.getUserByName(NEW_NAME));
    }
}
