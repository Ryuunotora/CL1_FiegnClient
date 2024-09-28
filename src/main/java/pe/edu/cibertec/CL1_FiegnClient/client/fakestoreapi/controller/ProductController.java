package pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.model.Product;
import pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.service.ProductService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @GetMapping("/producto/{id}")
    public Product obtenerProductoXid(@PathVariable("id") Long id){
        return productService.obtenerProductoXid(id);
    }

    @GetMapping("/producto")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
