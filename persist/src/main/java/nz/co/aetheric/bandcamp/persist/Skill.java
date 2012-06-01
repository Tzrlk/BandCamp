package nz.co.aetheric.bandcamp.persist;

public class Skill {

    String name;

    Realm realm;

    String description;

    Integer penalty;

    public String getName() {
        return name;
    }

    public Skill setName(String name) {
        this.name = name;
        return this;
    }

    public Realm getRealm() {
        return realm;
    }

    public Skill setRealm(Realm realm) {
        this.realm = realm;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Skill setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getPenalty() {
        return penalty;
    }

    public Skill setPenalty(Integer penalty) {
        this.penalty = penalty;
        return this;
    }
}
