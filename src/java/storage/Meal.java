package storage;

public class Meal extends StorageElement {
    /**
     * Meal class shall be used to follow the amount of our food
     * The food shall be identified by name (creating new classes are not necessary)
     *
     * hint: Set
     */

    private String type;
    private boolean category;

    public Meal() {
    }

    public Meal(String name, int amount, String type) {
        super(name, amount);
        this.type = type;
    }

    public Meal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Meal(String name, int amount, String type, boolean category) {
        super(name, amount);
        this.type = type;
        this.category = category;
    }

    public boolean isCategory() {
        return category;
    }

    public void setCategory(boolean category) {
        this.category = category;
    }
}
