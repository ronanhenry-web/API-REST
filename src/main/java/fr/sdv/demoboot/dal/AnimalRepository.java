package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.AbstractAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface AnimalRepository extends JpaRepository<AbstractAnimal, Long> {
    List<AbstractAnimal> findByBirth(LocalDate birth);
}
