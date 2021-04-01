package com.taras.spring.core.beansImpInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewBean {
    @Autowired
    private Animal animal;
    public void zoo()
    {
        System.out.println(animal);
        System.out.println(animalCat);
        System.out.println(animalDog);
    }
    @Autowired
    @Qualifier("dog")
    private Animal animalDog;
    @Autowired
    @Qualifier("cat")
    private Animal animalCat;
}
