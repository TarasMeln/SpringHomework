package com.taras.spring.core.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanA implements InitializingBean , DisposableBean {
    private String name;
    private int value;

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "BeanA{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Inside DisposableBean.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Inside InitializingBean.afterPropertySet()");

    }
}
