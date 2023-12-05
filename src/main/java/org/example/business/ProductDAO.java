package org.example.business;

import org.example.infrastructure.database.entity.ProductEntity;

public interface ProductDAO {

    ProductEntity getProduct(final Integer productId);

    void saveProduct(final ProductEntity productEntity);

    void deleteProduct(final Integer productId);
}
