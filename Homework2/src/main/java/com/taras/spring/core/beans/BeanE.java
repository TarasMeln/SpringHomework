package com.taras.spring.core.beans;
import org.springframework.stereotype.Component;

@Component
public class BeanE {
    private String name;
    private String value;

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
