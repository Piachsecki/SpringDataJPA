package org.example.business;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.jparepositories.CustomerDatabaseRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class SortingService {
    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void call(){
        Sort sort = Sort.by("name").ascending()
                .and(Sort.by("dateOfBirth")).ascending();




        customerDatabaseRepository.findAll(sort)
                .forEach(customer -> System.out.println("####" + customer));
    }
}
