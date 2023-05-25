package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
