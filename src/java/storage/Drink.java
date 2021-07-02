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

    public Drink() {
    }

    public Drink(String name, int amount) {
        super(name, amount);
    }

    public Drink(String name, int amount, boolean isAlcoholic) {
        super(name, amount);
        this.isAlcoholic = isAlcoholic;
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
}
