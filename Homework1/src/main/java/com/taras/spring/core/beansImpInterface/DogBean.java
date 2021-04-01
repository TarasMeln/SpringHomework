package com.taras.spring.core.beansImpInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Qualifier("dog")
@Component
@Order(1)
public class DogBean implements Animal {
    @Override
    public String toString() {
        return "Dog";
    }
}
