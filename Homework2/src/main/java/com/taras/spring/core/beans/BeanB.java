package com.taras.spring.core.beans;

import org.springframework.beans.factory.annotation.Value;

public class BeanB {
    @Value("${name}")
    private String name;
    @Value("${value}")
    private String value;

    @Override
    public String toString() {
        return "BeanB{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    private void customInitMethod() {
        System.out.println("Inside init method B");
    }
    public void anotherCustomInitMethod()
    {
        System.out.println("Inside anotherCustomInitMethod B");
    }


    private void customDestroyMethod() {
        System.out.println("Inside destroy method B");
    }
}
