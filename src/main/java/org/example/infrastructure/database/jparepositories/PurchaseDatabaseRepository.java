package org.example.infrastructure.database.jparepositories;

import org.example.infrastructure.database.entity.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.List;

@Repository
public interface PurchaseDatabaseRepository extends JpaRepository<PurchaseEntity, Integer> {
    List<PurchaseEntity> findByDateTimeBetween(OffsetDateTime d1, OffsetDateTime d2);

}
