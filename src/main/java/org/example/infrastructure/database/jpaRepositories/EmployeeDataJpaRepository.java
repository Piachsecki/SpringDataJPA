package org.example.infrastructure.database.jpaRepositories;


import org.example.infrastructure.database.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeDataJpaRepository extends JpaRepository<EmployeeEntity, Integer> {
    Optional<EmployeeEntity> findByNameAndSurname(final String name, final String surname);

}
