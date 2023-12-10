package org.example.infrastructure.database.jparepositories;

import org.example.infrastructure.database.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductDatabaseRepository extends JpaRepository<ProductEntity, Integer> {
    List<ProductEntity> findByProductPriceGreaterThan(BigDecimal price);
    List<ProductEntity> findByProductPriceLessThan(BigDecimal price);
    List<ProductEntity> findByProductPriceBetween(BigDecimal p1, BigDecimal p2);
    List<ProductEntity> findByProductNameContaining(String name);
    List<ProductEntity> findByProductNameLike(String name);


}
