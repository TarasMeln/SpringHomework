package com.taras.spring.core.beans.beans1;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
