package com.livedrof.spring.dao.impl;

import com.livedrof.spring.dao.IUser;
import com.livedrof.spring.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserImpl implements IUser {
    public User saveUser(User user) {
        System.out.println(user);
        return new User();
    }
}
