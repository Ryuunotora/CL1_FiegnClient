package pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.iclientservice;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.model.Product;

import java.util.List;

@FeignClient(name= "fakestoreapi",
        url = "https://fakestoreapi.com/")
public interface FakeStoreClient {

    @GetMapping("/products/{id}")
    Product obtenerProductoXid(@PathVariable("id") Long id);

    @GetMapping("/products")
    List<Product> getProducts();
}
