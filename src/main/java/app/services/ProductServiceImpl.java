package app.services;

import app.dto.ProductDto;
import app.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDto createProduct(ProductDto product) {
        productRepository.create(product);
    }

    @Override
    public ProductDto updateProduct(ProductDto product, UUID id) {
        productRepository.update(product, id);
    }

    @Override
    public void deleteProduct(UUID id) {
        productRepository.delete(id);
    }

    @Override
    public ProductDto getProductById(UUID id) {
        List<ProductDto> products = productRepository.findAll();
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ProductDto> getProducts() {
        return productRepository.findAll();
    }
}
