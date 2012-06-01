package nz.co.aetheric.bandcamp.persist;

import java.util.List;

public class Character {

    Long id;

    String name;

    CharacterType characterType;

    Word word;

    Resonance resonance;

    Character superior;

    List<Attunement> attunements;

    Integer forcesCorporeal;

    Integer forcesCelestial;

    Integer forcesEthereal;

    Integer strength;

    Integer intelligence;

    Integer will;

    Integer characterPoints;

    List<Song> songs;
    
    List<Vessel> vessels;

    List<Skill> skills;

    List<Item> items;

    List<Discord> discords;

    Integer essence;

    List<Rite> rites;

    List<Servant> servants;

    List<Event> history;

    public Long getId() {
        return id;
    }

    public Character setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Character setName(String name) {
        this.name = name;
        return this;
    }

    public CharacterType getCharacterType() {
        return characterType;
    }

    public Character setCharacterType(CharacterType characterType) {
        this.characterType = characterType;
        return this;
    }

    public Word getWord() {
        return word;
    }

    public Character setWord(Word word) {
        this.word = word;
        return this;
    }

    public Resonance getResonance() {
        return resonance;
    }

    public Character setResonance(Resonance resonance) {
        this.resonance = resonance;
        return this;
    }

    public Character getSuperior() {
        return superior;
    }

    public Character setSuperior(Character superior) {
        this.superior = superior;
        return this;
    }

    public List<Attunement> getAttunements() {
        return attunements;
    }

    public Character setAttunements(List<Attunement> attunements) {
        this.attunements = attunements;
        return this;
    }

    public Integer getForcesCorporeal() {
        return forcesCorporeal;
    }

    public Character setForcesCorporeal(Integer forcesCorporeal) {
        this.forcesCorporeal = forcesCorporeal;
        return this;
    }

    public Integer getForcesCelestial() {
        return forcesCelestial;
    }

    public Character setForcesCelestial(Integer forcesCelestial) {
        this.forcesCelestial = forcesCelestial;
        return this;
    }

    public Integer getForcesEthereal() {
        return forcesEthereal;
    }

    public Character setForcesEthereal(Integer forcesEthereal) {
        this.forcesEthereal = forcesEthereal;
        return this;
    }

    public Integer getStrength() {
        return strength;
    }

    public Character setStrength(Integer strength) {
        this.strength = strength;
        return this;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public Character setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
        return this;
    }

    public Integer getWill() {
        return will;
    }

    public Character setWill(Integer will) {
        this.will = will;
        return this;
    }

    public Integer getCharacterPoints() {
        return characterPoints;
    }

    public Character setCharacterPoints(Integer characterPoints) {
        this.characterPoints = characterPoints;
        return this;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Character setSongs(List<Song> songs) {
        this.songs = songs;
        return this;
    }

    public List<Vessel> getVessels() {
        return vessels;
    }

    public Character setVessels(List<Vessel> vessels) {
        this.vessels = vessels;
        return this;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public Character setSkills(List<Skill> skills) {
        this.skills = skills;
        return this;
    }

    public List<Item> getItems() {
        return items;
    }

    public Character setItems(List<Item> items) {
        this.items = items;
        return this;
    }

    public List<Discord> getDiscords() {
        return discords;
    }

    public Character setDiscords(List<Discord> discords) {
        this.discords = discords;
        return this;
    }

    public Integer getEssence() {
        return essence;
    }

    public Character setEssence(Integer essence) {
        this.essence = essence;
        return this;
    }

    public List<Rite> getRites() {
        return rites;
    }

    public Character setRites(List<Rite> rites) {
        this.rites = rites;
        return this;
    }

    public List<Servant> getServants() {
        return servants;
    }

    public Character setServants(List<Servant> servants) {
        this.servants = servants;
        return this;
    }

    public List<Event> getHistory() {
        return history;
    }

    public Character setHistory(List<Event> history) {
        this.history = history;
        return this;
    }
}