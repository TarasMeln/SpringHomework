package com.taras.spring.core.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("inside BeanPostProcessor.postProcessBeforeInitialization");
        System.out.println(" >> bean = " + bean + ", beanName = " + beanName);
        if (bean instanceof BeanA) {
            ((BeanA) bean).setName("taras");
            ((BeanA) bean).setValue(20);
        }
        if (bean instanceof BeanE) {
            ((BeanE) bean).setName("taras");
            ((BeanE) bean).setValue(20);
        }
        if (bean instanceof BeanF) {
            ((BeanF) bean).setName("taras");
            ((BeanF) bean).setValue(20);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("inside BeanPostProcessor.postProcessBeforeInitialization");
        System.out.println(" >> bean = " + bean + ", beanName = " + beanName);
        return bean;
    }
}
