package com.livedrof.spring.conditional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ConditionConfigTest {
    @Autowired
    MagicBean magicBean;

    @Test
    public void test() {
        System.out.println(magicBean);
    }
}
