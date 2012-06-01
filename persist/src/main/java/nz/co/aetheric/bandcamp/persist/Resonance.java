package nz.co.aetheric.bandcamp.persist;

public class Resonance {

    String name;

    String description;

    public String getName() {
        return name;
    }

    public Resonance setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Resonance setDescription(String description) {
        this.description = description;
        return this;
    }
}
