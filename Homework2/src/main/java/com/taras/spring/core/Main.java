package com.taras.spring.core;

import com.taras.spring.core.beans.*;
import com.taras.spring.core.config.Config1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config1.class);
        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
//        BeanA beanA = context.getBean(BeanA.class);
//        System.out.println(beanA.toString());
//        BeanB beanB = context.getBean(BeanB.class);
//        System.out.println(beanB.toString());
//
//        BeanC beanC = context.getBean(BeanC.class);
//        System.out.println(beanC.toString());
//
//        BeanD beanD = context.getBean(BeanD.class);
//        System.out.println(beanD.toString());
//        BeanE beanE = context.getBean(BeanE.class);
//        System.out.println(beanE.toString());
//        BeanF beanF = context.getBean(BeanF.class);
//        System.out.println(beanF.toString());

    }
}
