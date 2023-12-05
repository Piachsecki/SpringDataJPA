package org.example.infrastructure.database;

import org.example.business.ProducerDAO;
import org.example.infrastructure.database.entity.ProducerEntity;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public class ProducerDatabaseRepository implements ProducerDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ProducerEntity getProducer(final Integer producerId) {
        return entityManager.find(ProducerEntity.class, producerId);
    }

    @Override
    public void saveProducer(final ProducerEntity producerEntity) {
        entityManager.persist(producerEntity);
    }

    @Override
    public void deleteProducer(final Integer producerId) {
        entityManager.remove(entityManager.find(ProducerEntity.class, producerId));
    }
}
