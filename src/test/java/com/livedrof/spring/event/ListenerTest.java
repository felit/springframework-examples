package com.livedrof.spring.event;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * TODO Spring自带的事件有哪些？TODO 有序事件
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class ListenerTest {
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void testPublishEvent() {
        applicationContext.publishEvent(new ContentEvent("news is  update"));
    }
}
