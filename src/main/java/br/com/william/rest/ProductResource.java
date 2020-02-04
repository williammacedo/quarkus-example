package br.com.william.rest;

import br.com.william.domain.Product;
import br.com.william.services.ProductService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/products")
public class ProductResource {

    @Inject
    ProductService service;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @POST
    public void createProduct(Product product) {
        service.createProduct(product);
    }
}
