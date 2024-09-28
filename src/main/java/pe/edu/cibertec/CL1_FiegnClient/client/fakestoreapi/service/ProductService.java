package pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.iclientservice.FakeStoreClient;
import pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.model.Product;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {

    private final FakeStoreClient fakeStoreClient;


    public Product obtenerProductoXid(Long id) {
        return fakeStoreClient.obtenerProductoXid(id);
    }

    public List<Product> getAllProducts() {
        return fakeStoreClient.getProducts();

    }
}
