package com.taras.spring.core.beansImpInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CollectionBean {
    @Autowired
    private List<Animal> animal;
    public void printAnimal() {
        System.out.println("Animal:"+ animal);
    }
}
