package org.example.business;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.example.infrastructure.database.jpaRepositories.EmployeeDataJpaRepository;
import org.example.infrastructure.database.model.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmployeeDataJpaRepository employeeRepository;

    @Transactional
    public void runSuccessful() {
        employeeRepository.deleteAll();
        employeeRepository.flush();

        EmployeeEntity employee1 = employeeRepository.save(EmployeeData.someEmployee1());
        EmployeeEntity employee2 = employeeRepository.save(EmployeeData.someEmployee2());
        EmployeeEntity employee3 = employeeRepository.save(EmployeeData.someEmployee3());

        System.out.println("###Employee 1: " + employeeRepository.findById(employee1.getEmployeeId()));
        System.out.println("###Employee 2: " + employeeRepository.findById(employee2.getEmployeeId()));

        EmployeeEntity employeeEntity = employeeRepository.findById(employee3.getEmployeeId()).orElseThrow();
        employeeEntity.setSalary(new BigDecimal("23423.23"));
        employeeRepository.saveAndFlush(employeeEntity);


        employeeRepository.findAll()
            .forEach(employee -> System.out.println("###Employee: " + employee));

        employeeRepository.deleteById(employee2.getEmployeeId());

        employeeRepository.findAll()
            .forEach(employee -> System.out.println("###Employee: " + employee));
    }

    @Transactional
    public void testTransactional() {
        employeeRepository.deleteAll();

        employeeRepository.saveAll(List.of(
                EmployeeData.someEmployee1(),
                EmployeeData.someEmployee2(),
                EmployeeData.someEmployee3(),
                EmployeeData.someEmployee3()

        ));
    }
}
