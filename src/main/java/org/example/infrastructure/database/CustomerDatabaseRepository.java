package org.example.infrastructure.database;

import org.example.business.CustomerDAO;
import org.example.infrastructure.database.entity.CustomerEntity;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class CustomerDatabaseRepository implements CustomerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CustomerEntity getCustomer(final Integer customerId) {
        return entityManager.find(CustomerEntity.class, customerId);
    }

    @Override
    public void saveCustomer(final CustomerEntity customerEntity) {
        entityManager.persist(customerEntity);
    }

    @Override
    public void deleteCustomer(final Integer customerId) {
        entityManager.remove(entityManager.find(CustomerEntity.class, customerId));
    }
}
