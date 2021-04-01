package com.taras.spring.core.beans.beans2;

import org.springframework.stereotype.Component;

@Component
public class NarcissusFlower {
    private String name;

    @Override
    public String toString() {
        return name;
    }
}
