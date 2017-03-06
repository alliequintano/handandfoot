package com.hnf.models;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.equalTo;

public class UserTest {

    @Test
    public void UserShouldHaveName() {
        User user = new User("some name");
        assertThat(user.getName(), is(equalTo("some name")));
    }
}
