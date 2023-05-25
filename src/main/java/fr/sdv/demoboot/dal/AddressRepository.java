package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.Address;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    List<Address> findByCity(String city);
}
