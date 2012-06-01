package nz.co.aetheric.bandcamp.persist;

public class Song {
    // composite key between realm and name;

    Realm realm;

    String name;

    String description;

    public Realm getRealm() {
        return realm;
    }

    public Song setRealm(Realm realm) {
        this.realm = realm;
        return this;
    }

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Song setDescription(String description) {
        this.description = description;
        return this;
    }
}
