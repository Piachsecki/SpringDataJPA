package org.example.infrastructure.database.jpaRepositories;


import org.example.infrastructure.database.model.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDataJpaRepository extends JpaRepository<EmployeeEntity, Integer> {

}
