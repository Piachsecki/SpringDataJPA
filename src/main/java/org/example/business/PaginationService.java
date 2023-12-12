package org.example.business;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.example.infrastructure.database.jparepositories.CustomerDatabaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service
public class PaginationService {
    private final CustomerDatabaseRepository customerDatabaseRepository;

    public void call(){
        paginate(0 , 10);
        paginate(1 , 10);
        paginate(3 , 10);
        paginate(5 , 10);
        paginate(6 , 10);
        paginate(9 , 10);
    }


    public void paginate(int pageNumber, int pageSize){
        Sort sort = Sort.by("name").ascending()
                .and(Sort.by("dateOfBirth")).ascending();
        System.out.printf("####Pagination: ");
        PageRequest pegeable = PageRequest.of(pageNumber, pageSize, sort);

        Page<CustomerEntity> page = customerDatabaseRepository.findAll(pegeable);
        List<CustomerEntity> content = page.getContent();


        if(content.isEmpty()){
            System.out.println("###PAGE IS EMPTY");
        }
        System.out.println("page.getTotalPages() = " + page.getTotalPages());
        System.out.println("page.getTotalElements() = " + page.getTotalElements());
        System.out.println("page.getNumberOfElements() = " + page.getNumberOfElements());
        System.out.println("page.getSize() = " + page.getSize());
        System.out.println("page.isLast() = " + page.isLast());





    }

}
