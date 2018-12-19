package com.spring;

import com.spring.config.MainConfig;
import com.spring.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMian {

    public static  void main(String[] agrs){

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        applicationContext.getBean("person");
        ApplicationContext applicationContext  =new AnnotationConfigApplicationContext(MainConfig.class);
        Person bean =applicationContext.getBean(Person.class);
         System.out.println(bean);
        String[] beans=applicationContext.getBeanNamesForType(Person.class);



    }
}

