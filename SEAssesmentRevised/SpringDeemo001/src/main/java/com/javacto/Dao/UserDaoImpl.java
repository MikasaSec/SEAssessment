package com.javacto.Dao;

import com.javacto.Po.User;

public class UserDaoImpl implements UserDao{
    public void queryAll(User user1){
        User user = new User();
        user.setUserId(1);
        user.setName("NMSLSB");
        user.setPassword("NMSLSB");
        user.setEmail("NMSLSB");
    }

}
