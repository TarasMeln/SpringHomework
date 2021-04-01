package com.taras.spring.core.otherBeans;

import org.springframework.stereotype.Component;

@Component("otherBeanB")
public class OtherBeanB {
    public void growing() {
        System.out.println("The beanB is growing");
    }
}
