package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCode(String code);
}
