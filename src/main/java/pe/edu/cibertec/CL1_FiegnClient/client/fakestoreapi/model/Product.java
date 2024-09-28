package pe.edu.cibertec.CL1_FiegnClient.client.fakestoreapi.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String image;
}