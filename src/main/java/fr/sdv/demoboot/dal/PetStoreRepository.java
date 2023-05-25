package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
    List<PetStore> findAll();
}
