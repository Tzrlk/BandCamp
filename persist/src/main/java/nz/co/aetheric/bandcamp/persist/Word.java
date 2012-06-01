package nz.co.aetheric.bandcamp.persist;

import java.util.List;

public class Word {

    String word;

    Integer forces;

    String description;

    Boolean superior;

    List<Attunement> attunements;

    List<Rite> rites;

    public String getWord() {
        return word;
    }

    public Word setWord(String word) {
        this.word = word;
        return this;
    }

    public Integer getForces() {
        return forces;
    }

    public Word setForces(Integer forces) {
        this.forces = forces;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Word setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Attunement> getAttunements() {
        return attunements;
    }

    public Word setAttunements(List<Attunement> attunements) {
        this.attunements = attunements;
        return this;
    }

    public List<Rite> getRites() {
        return rites;
    }

    public Word setRites(List<Rite> rites) {
        this.rites = rites;
        return this;
    }

    public Boolean getSuperior() {
        return superior;
    }

    public Word setSuperior(Boolean superior) {
        this.superior = superior;
        return this;
    }
}
