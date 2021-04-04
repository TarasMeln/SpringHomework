package com.taras.spring.core.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanE {
    private String name;
    private int value;

    @Override
    public String toString() {
        return "BeanE{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
    @PostConstruct
    public void postConstruct() {
        System.out.println("inside @PostConstruct");
    }
    @PreDestroy
    public void preDestroy() {

        System.out.println("inside @preDestroy");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
