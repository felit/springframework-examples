package com.livedrof.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserOneListener implements ApplicationListener<ApplicationEvent> {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(event);
        if (event instanceof ContentEvent) {
            System.out.println("[UserOneListener]msg：" + event.getSource());
        }
    }
}
