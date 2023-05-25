package fr.sdv.demoboot.bo;

import jakarta.persistence.*;

@Entity
public class Cat extends AbstractAnimal {
    private String chipId;

    public Cat() {
    }

    public String getChipId() {
        return chipId;
    }

    public void setChipId(String chipId) {
        this.chipId = chipId;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "chipId='" + chipId + '\'' +
                '}';
    }
}
