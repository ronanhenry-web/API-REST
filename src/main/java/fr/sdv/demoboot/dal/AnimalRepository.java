package fr.sdv.demoboot.dal;

import fr.sdv.demoboot.bo.AbstractAnimal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AbstractAnimal, Long> {

}
