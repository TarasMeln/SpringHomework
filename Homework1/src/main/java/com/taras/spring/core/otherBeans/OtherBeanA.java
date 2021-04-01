package com.taras.spring.core.otherBeans;

import org.springframework.stereotype.Component;

@Component("otherBeanA")
public class OtherBeanA {

    public void growing() {
        System.out.println("The beanA is growing");
    }
}
