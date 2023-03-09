package com.rafaelovna.mockito;

import com.rafaelovna.mockito.dao.impl.UserDaoImpl;
import com.rafaelovna.mockito.model.User;
import com.rafaelovna.mockito.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.when;


public class UserServiceTest {

    public static final String USER_NAME = "Mariya";
    public static final String NEW_USER_NAME = "Galina";
    User user2 = new User("Mariya", "mariya", "mariya@mail.ru");
    User out = new User("Galina", "galina", "galina@mail.ru");


    @Mock
    private UserDaoImpl userDao = new UserDaoImpl();

    @InjectMocks
    private UserServiceImpl userService;

    public UserServiceTest() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void shouldCheckUserExists() {
        when(userDao.getUserByName(USER_NAME)).thenReturn(user2);
        Assertions.assertTrue(userService.checkUserExist(user2));

    }

    @Test
    public void shouldCheckUserExists1() {
        when(userDao.getUserByName(NEW_USER_NAME)).thenReturn(null);
        Assertions.assertFalse(userService.checkUserExist(out));
    }
}
