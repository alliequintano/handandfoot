package com.hnf.models;

public class UserTest {

    @Test
    public void UserShouldHaveName() {
        User user = new User("some name");
        AssertThat(user.getName).isEqual("some name");
    }
}
