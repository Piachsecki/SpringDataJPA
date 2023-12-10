package org.example.business;

import lombok.AllArgsConstructor;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.example.infrastructure.database.entity.Stars;
import org.example.infrastructure.database.jparepositories.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Service
@AllArgsConstructor
public class SomeService {

    private CustomerDatabaseRepository customerDatabaseRepository;
    private OpinionDatabaseRepository opinionDatabaseRepository;
    private ProducerDatabaseRepository producerDatabaseRepository;
    private ProductDatabaseRepository productDatabaseRepository;
    private PurchaseDatabaseRepository purchaseDatabaseRepository;

    @Transactional
    public void call() {
//        System.out.println("###findByEmail " + customerDatabaseRepository.findByEmail(52));
//        System.out.println("###findByCustomerId " + customerDatabaseRepository.findByCustomerId(13));
//        System.out.println("###findByNameOrEmail " + customerDatabaseRepository.findByNameOrEmail(2));
//        System.out.println("###findByNameAndSurname " + customerDatabaseRepository.findByNameAndSurname(22));
//        System.out.println("###findDistinctByEmail " + customerDatabaseRepository.findDistinctByEmail("whatever"
//        ));
//        System.out.println(opinionDatabaseRepository.countAllOpinions());

//        System.out.println(opinionDatabaseRepository.findByCustomerEmail("tweeden1i@i2i.jp"));
//        opinionDatabaseRepository.updateWrongOpinions(Stars.FOUR, Set.of(Stars.ONE, Stars.TWO));
//        System.out.println(opinionDatabaseRepository.countWrongOpinions());
//
//        opinionDatabaseRepository.deleteOpinionsContaining("gieu");
//        System.out.println(opinionDatabaseRepository.countAllOpinions());
//        System.out.println(opinionDatabaseRepository.countOpinionsWhereStarsAreEqualToFour());


        CustomerEntity byEmail = customerDatabaseRepository.findByEmail("gseaking1@wikipedia.org");
        System.out.println(byEmail.getPurchaseEntities());
    }
}
