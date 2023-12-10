package org.example.infrastructure.database.jparepositories;

import org.example.infrastructure.database.entity.CustomerEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerDatabaseRepository extends JpaRepository<CustomerEntity, Integer> {

    @EntityGraph(
            type = EntityGraph.EntityGraphType.FETCH,
            attributePaths = {
                    "purchaseEntities",
                    "purchaseEntities.opinionEntity"
            }
    )
    CustomerEntity findByEmail(String email);
}
