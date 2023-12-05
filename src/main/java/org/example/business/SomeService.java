package org.example.business;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SomeService {

    private final CustomerDAO customerDAO;
    private final OpinionDAO opinionDAO;
    private final ProducerDAO producerDAO;
    private final ProductDAO productDAO;
    private final PurchaseDAO purchaseDAO;

    public void call() {
        System.out.println("#Customer: " + customerDAO.getCustomer(52));
        System.out.println("#Opinion: " + opinionDAO.getOpinion(13));
        System.out.println("#Producer: " + producerDAO.getProducer(2));
        System.out.println("#Product: " + productDAO.getProduct(22));
        System.out.println("#Purchase: " + purchaseDAO.getPurchase(117));
    }
}
