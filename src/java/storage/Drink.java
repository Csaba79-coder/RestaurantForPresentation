package storage;

public class Drink extends StorageElement {
    /**
     * Drink class shall be used to follow the states of our drinks
     * The drinks shall be identified by name (creating new classes are not necessary)
     * The amount of each drink shall be also followed
     *
     * hint: List
     */

    private boolean isAlcoholic;
    private String type;

    public Drink() {
    }

    public Drink(String name, int amount) {
        super(name, amount);
    }

    public Drink(String name, int amount, boolean isAlcoholic, String type) {
        super(name, amount);
        this.isAlcoholic = isAlcoholic;
        this.type = type;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public Drink(boolean isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
