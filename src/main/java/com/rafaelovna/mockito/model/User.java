package com.rafaelovna.mockito.model;

import lombok.Data;

@Data
public class User {

    private String name;
    private String login;
    private String email;


    public User(String name, String login, String email) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Укажите имя пользователя.");
        } else {
            this.name = name;
        }

        if (login == null || login.isEmpty()) {
            throw new RuntimeException("Введите логин");
        } else if (login.contains("@") || login.contains(".")) {
            throw new RuntimeException("Логин не может состоять из символов '@' и '.'");
        } else {
            this.login = login;
        }

        if (email == null || email.isEmpty()) {
            throw new RuntimeException("Введите почту");
        } else if (!email.contains("@") || !email.contains(".")) {
            throw new RuntimeException("Электронная почта должна включать символы: '@' и '.'");
        } else {
            this.email = email;
        }
    }
}
