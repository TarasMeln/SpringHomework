package com.taras.spring.core.otherBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldC {
    @Autowired
    private OtherBeanC otherBeanC;

    public void beansGrow() {
        otherBeanC.growing();
    }
}
