package org.srikanth.spring.di.springdi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory invoked");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName invoked");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy invoked");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet invoked");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext invoked");

    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy invoked");

    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct invoked");

    }

    public void beforeInit(){
        System.out.println("beforeInit invoked");

    }

    public void afterInit(){
        System.out.println("afterInit invoked");

    }
}

