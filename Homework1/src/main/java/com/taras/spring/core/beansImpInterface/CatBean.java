package com.taras.spring.core.beansImpInterface;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Qualifier("cat")
@Component
@Order(2)
public class CatBean implements Animal{

    @Override
    public String toString() {
        return "Cat";
    }

}
