package com.taras.spring.core.otherBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldA {
    private OtherBeanA otherBeanA;
    @Autowired
    public FieldA(OtherBeanA otherBeanA) {
        this.otherBeanA = otherBeanA;
    }
    public void beansGrow() {
        otherBeanA.growing();
    }
}
