package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.AbstractAnimal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin
public interface AnimalRepository extends JpaRepository<AbstractAnimal, Long> {
    List<AbstractAnimal> findAllByCouleur(String couleur);
}
