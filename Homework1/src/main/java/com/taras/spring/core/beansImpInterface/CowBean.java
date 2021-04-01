package com.taras.spring.core.beansImpInterface;

import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Primary
@Component
@Order(3)
public class CowBean implements Animal {
    @Override
    public String toString() {
        return "Cow";
    }
}
