package app.services;

import app.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * ProductService
 * Defines the methods that will be implemented in the ProductServiceImpl class.
 * CRUD operations for the Product entity.
 * @see app.services.ProductServiceImpl
 */
@Service
public interface ProductService {
    ProductDto createProduct(ProductDto product);
    ProductDto updateProduct(ProductDto product, UUID id);
    void deleteProduct(UUID id);
    ProductDto getProductById(UUID id);
    List<ProductDto> getProducts();
}
