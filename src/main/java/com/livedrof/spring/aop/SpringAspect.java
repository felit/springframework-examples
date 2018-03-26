package com.livedrof.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SpringAspect {

    @Pointcut(value = "@annotation(com.livedrof.spring.aop.anno.Compensable)")
    public void compensable() {

    }

    @Around("compensable()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("around begin:" + point);
        Object result = point.proceed();
        System.out.println("around end:" + result);
        return result;
    }

}