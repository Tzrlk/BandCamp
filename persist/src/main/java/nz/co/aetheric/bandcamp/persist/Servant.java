package nz.co.aetheric.bandcamp.persist;

public class Servant {

    Long id;

    String name;

    Long rating;

    String description;

    public Long getId() {
        return id;
    }

    public Servant setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Servant setName(String name) {
        this.name = name;
        return this;
    }

    public Long getRating() {
        return rating;
    }

    public Servant setRating(Long rating) {
        this.rating = rating;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Servant setDescription(String description) {
        this.description = description;
        return this;
    }
}
