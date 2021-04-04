package com.taras.spring.core.config;

import com.taras.spring.core.beans.*;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@Import(Config2.class)
public class Config1 {

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
    public BeanD beanD() {
        return new BeanD();
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
//    @DependsOn({"beanD"})
    public BeanB beanB() {
        return new BeanB();
    }

    @Bean(initMethod = "customInitMethod", destroyMethod = "customDestroyMethod")
//    @DependsOn({"beanD", "beanB"})
    public BeanC beanC() {
        return new BeanC();
    }

    @Bean
    public BeanA beanA() {
        return new BeanA();
    }

    @Bean
    public BeanE beanE() {
        return new BeanE();
    }

    @Bean
    @Lazy
    public BeanF beanF() {
        return new BeanF();
    }

    @Bean
    public BeanFactoryPost beanFactoryPost() {
        return new BeanFactoryPost();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
