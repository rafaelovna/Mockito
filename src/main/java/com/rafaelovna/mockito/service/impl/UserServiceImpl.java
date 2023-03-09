package com.rafaelovna.mockito.service.impl;


import com.rafaelovna.mockito.dao.impl.UserDaoImpl;
import com.rafaelovna.mockito.model.User;
import com.rafaelovna.mockito.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDaoImpl userDao;

    @Override
    public boolean checkUserExist(User user) {
        return Objects.equals(user, userDao.getUserByName(user.getName()));
    }

}
