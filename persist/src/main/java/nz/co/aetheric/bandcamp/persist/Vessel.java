package nz.co.aetheric.bandcamp.persist;

import javax.management.relation.Role;
import java.util.List;

public class Vessel {

    Long id;

    Role role;

    Integer level;

    String description;

    List<Song> enhancements;

    public Long getId() {
        return id;
    }

    public Vessel setId(Long id) {
        this.id = id;
        return this;
    }

    public Role getRole() {
        return role;
    }

    public Vessel setRole(Role role) {
        this.role = role;
        return this;
    }

    public Integer getLevel() {
        return level;
    }

    public Vessel setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Vessel setDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Song> getEnhancements() {
        return enhancements;
    }

    public Vessel setEnhancements(List<Song> enhancements) {
        this.enhancements = enhancements;
        return this;
    }
}
