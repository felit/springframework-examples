package com.livedrof.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;

public class Bean2 implements BeanNameAware, BeanFactoryAware, DisposableBean {
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    public void setBeanName(String name) {

    }

    public void destroy() throws Exception {

    }
}
