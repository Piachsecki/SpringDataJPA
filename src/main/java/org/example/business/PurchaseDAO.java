package org.example.business;

import org.example.infrastructure.database.entity.PurchaseEntity;

public interface PurchaseDAO {

    PurchaseEntity getPurchase(final Integer purchaseId);

    void savePurchase(final PurchaseEntity purchaseEntity);

    void deletePurchase(final Integer purchaseId);
}
