package com.taras.spring.core.otherBeans;

import org.springframework.stereotype.Component;

@Component("otherBeanC")
public class OtherBeanC {
    public void growing() {
        System.out.println("The beanC is growing");
    }
}
