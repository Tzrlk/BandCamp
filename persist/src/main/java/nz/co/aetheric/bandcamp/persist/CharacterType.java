package nz.co.aetheric.bandcamp.persist;

public class CharacterType {

    String name;

    String description;

    public String getName() {
        return name;
    }

    public CharacterType setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public CharacterType setDescription(String description) {
        this.description = description;
        return this;
    }
}