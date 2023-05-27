package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.PetStore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface PetStoreRepository extends JpaRepository<PetStore, Long> {
    List<PetStore> findAll();
}
