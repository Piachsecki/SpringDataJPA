package org.example;

import org.example.business.PaginationService;
import org.example.business.QueryByExampleService;
import org.example.business.SomeService;
import org.example.business.SortingService;
import org.example.infrastructure.configuration.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZajavkaStoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        PaginationService someService = context.getBean(PaginationService.class);
//        QueryByExampleService someService = context.getBean(QueryByExampleService.class);
//        someService.queryByExample();
        someService.call();
    }
}
