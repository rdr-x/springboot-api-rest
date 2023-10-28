package app.controller;

import app.dto.ProductDto;
import app.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
        private final ProductService productService;

        public ProductController(ProductService productService) {
            this.productService = productService;
        }

        @GetMapping("/products")
        public ResponseEntity<String> getProducts() {
            return ResponseEntity.ok("PRODUCTS");
        }

        @GetMapping("{id}")
        public ResponseEntity<String> getProduct(@RequestParam(value = "id", defaultValue = "PC") String id) {
            return ResponseEntity.ok(String.format("Hello %s", id));
        }

        @PostMapping
        public ResponseEntity<String> postProduct(@RequestBody ProductDto product) {
            productService.createProduct(product);
        }
}
