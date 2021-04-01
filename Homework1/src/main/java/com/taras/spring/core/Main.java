package com.taras.spring.core;

import com.taras.spring.core.beansImpInterface.*;
import com.taras.spring.core.config.*;
import com.taras.spring.core.otherBeans.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

//        Task3
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(Config1.class);
//        for (String beanDefinitionName : context1.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

//        Task4
//        ApplicationContext context2 = new AnnotationConfigApplicationContext(Config2.class);
//        for (String beanDefinitionName : context2.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }

//        Task6
//        ApplicationContext context3 = new AnnotationConfigApplicationContext(Config3.class);
//        FieldA fieldA = context3.getBean(FieldA.class);
//        fieldA.beansGrow();
//        FieldB fieldB = context3.getBean(FieldB.class);
//        fieldB.beansGrow();
//        FieldC fieldC = context3.getBean(FieldC.class);
//        fieldC.beansGrow();

//        Task7
//        ApplicationContext context4 = new AnnotationConfigApplicationContext(Config4.class);
//        CollectionBean collectionBean = context4.getBean(CollectionBean.class);
//        collectionBean.printAnimal();

//        Task8
//        ApplicationContext context5 = new AnnotationConfigApplicationContext(Config4.class);
//        NewBean newBean = context4.getBean(NewBean.class);
//        newBean.zoo();
//        System.out.println("----------------------------");

//        Task9
//        ApplicationContext AllContext = new AnnotationConfigApplicationContext(Config1.class, Config2.class, Config3.class, Config4.class);
//        for (String beanDefinitionName : AllContext.getBeanDefinitionNames()) {
//            System.out.println(beanDefinitionName);
//        }
    }
}
