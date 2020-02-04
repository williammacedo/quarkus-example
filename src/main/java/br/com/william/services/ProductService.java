package br.com.william.services;

import br.com.william.domain.Product;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@RequestScoped
public class ProductService {

    @Inject
    EntityManager entityManager;

    public List<Product> getProducts() {
        return entityManager.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    @Transactional
    public void createProduct(Product product) {
        entityManager.persist(product);
    }
}
