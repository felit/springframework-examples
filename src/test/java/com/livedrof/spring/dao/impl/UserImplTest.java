package com.livedrof.spring.dao.impl;

import com.livedrof.spring.aop.SpringAspect;
import com.livedrof.spring.dao.IUser;
import com.livedrof.spring.dto.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserImplTest {
    @Autowired
    IUser user;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void saveUser() {
        user.saveUser(new User());
    }
}
