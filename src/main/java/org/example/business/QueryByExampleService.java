package org.example.business;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.example.infrastructure.database.jparepositories.CustomerDatabaseRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class QueryByExampleService {
    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void queryByExample(){
        ExampleMatcher exampleMatcher = ExampleMatcher.matchingAll().withIgnoreCase();
        CustomerEntity customer = CustomerEntity.builder().name("Florian").build();
        Example<CustomerEntity> example = Example.of(customer, exampleMatcher);

        List<CustomerEntity> all = customerDatabaseRepository.findAll(example);

        System.out.println("###FOUND: " +all);
    }

}
