package com.livedrof.spring.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * TODO Bean的生命周期，及相应的扩展点。
 */
public class LifeCycleBean implements BeanNameAware, BeanFactoryAware, DisposableBean, InitializingBean {
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    public void setBeanName(String name) {

    }

    public void destroy() throws Exception {

    }

    @PostConstruct
    public void init() {

    }

    @PreDestroy
    public void beanDestroy() {

    }

    public void afterPropertiesSet() throws Exception {

    }
}
