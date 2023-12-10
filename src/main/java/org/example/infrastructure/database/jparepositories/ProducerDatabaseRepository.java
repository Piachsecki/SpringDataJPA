package org.example.infrastructure.database.jparepositories;

import org.example.infrastructure.database.entity.ProducerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProducerDatabaseRepository extends JpaRepository<ProducerEntity, Integer> {


}
