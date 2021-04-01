package com.taras.spring.core.beans.beans3;

import org.springframework.stereotype.Component;

@Component
public class BeanF {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
