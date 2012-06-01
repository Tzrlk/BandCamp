package nz.co.aetheric.bandcamp.persist;

public class Rite {

    Long id;

    String description;

    Boolean basic;

    Integer value;

    public Long getId() {
        return id;
    }

    public Rite setId(Long id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Rite setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getBasic() {
        return basic;
    }

    public Rite setBasic(Boolean basic) {
        this.basic = basic;
        return this;
    }

    public Integer getValue() {
        return value;
    }

    public Rite setValue(Integer value) {
        this.value = value;
        return this;
    }
}
