package com.taras.spring.core.beans;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.properties")
public class BeanD {
    @Value("${name}")
    private String name;
    @Value("${value}")
    private String value;

    @Override
    public String toString() {
        return "BeanD{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    private void customDestroyMethod() {
        System.out.println("Inside destroy method D");
    }

    private void customInitMethod() {
        System.out.println("Inside init method D");
    }
}
