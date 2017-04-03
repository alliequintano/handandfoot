package com.hnf.store;

import com.hnf.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class SessionStore implements Store {
    private static final String USER_KEY = "USER_KEY";
    private int userCount = 0;

    @Autowired
    private HttpSession httpSession;

    @Override
    public void saveUser(User user) {
        httpSession.setAttribute(USER_KEY, user);
        userCount++;
    }

    @Override
    public User getUser() {
        return (User) httpSession.getAttribute(USER_KEY);
    }

    @Override
    public int getUserCount() {
        return userCount;
    }
}
