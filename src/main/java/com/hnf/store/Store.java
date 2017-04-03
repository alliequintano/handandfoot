package com.hnf.store;

import com.hnf.models.User;

public interface Store {
    void saveUser(User user);
    User getUser();
    int getUserCount();
}
