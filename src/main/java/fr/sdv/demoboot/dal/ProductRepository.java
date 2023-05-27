package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCode(String code);
}
