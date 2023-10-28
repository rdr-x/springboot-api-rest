package app.repository;

import app.dto.ProductDto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.UUID;
public interface ProductRepository extends JpaRepository<ProductDto, UUID> {
    void create(ProductDto product);
    void update(ProductDto product, UUID id);
    void delete(UUID id);
    void getProductById(UUID id);
    List<ProductDto> findAll();
}
