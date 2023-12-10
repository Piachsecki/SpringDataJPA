package org.example;

import org.example.business.QueryByExampleService;
import org.example.business.SomeService;
import org.example.infrastructure.configuration.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZajavkaStoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SomeService someService = context.getBean(SomeService.class);
//        QueryByExampleService someService = context.getBean(QueryByExampleService.class);
//        someService.queryByExample();
        someService.call();
    }
}
