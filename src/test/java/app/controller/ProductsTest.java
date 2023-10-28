package app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class ProductsTest {

    @Autowired
    ProductController controller;

    @Test
    public void getProducts() {
        ResponseEntity<String> responseEntity = controller.getProducts();

        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Hello World!", responseEntity.getBody());
    }

    @Test
    public void getProduct() {
        ResponseEntity<String> responseEntity = controller.getProduct("Intel Core i9-14900kf");

        Assertions.assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        Assertions.assertEquals("Hello friend!", responseEntity.getBody());
    }

}