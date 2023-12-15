package org.example.business;


import org.example.infrastructure.configuration.ApplicationConfiguration;
import org.example.infrastructure.database.model.EmployeeEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@SpringJUnitConfig(classes = {ApplicationConfiguration.class})
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    void test(){
        //given
        employeeService.create(someEmployee());

        //when
        List<EmployeeEntity> allEmployees = employeeService.findAll();

        //when
        Assertions.assertEquals(1, allEmployees.size());
    }

    private EmployeeEntity someEmployee() {
        return EmployeeEntity.builder()
                .name("Kacperski")
                .surname("Piasek")
                .salary(BigDecimal.valueOf(1234.23))
                .since(OffsetDateTime.now())
                .build();
    }

}
