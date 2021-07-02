package storage;

public class KitchenTool extends StorageElement {
    /**
     * KitchenTool class shall be used to follow the states of our tools
     * The tools shall be identified by name (creating new classes are not necessary)
     * The amount of each tool shall be also followed
     * The following states are mandatory:
     *      available
     *      in use
     *      dirty
     *      depreciated
     *
     * hint: Map
     */

    private int available;
    private int inUse;
    private int dirty;
    private int depreciated;

    public KitchenTool() {
    }

    public KitchenTool(String name, int amount) {
        super(name, amount);
    }

    public KitchenTool(String name, int amount, int available, int inUse, int dirty, int depreciated) {
        super(name, amount);
        this.available = available;
        this.inUse = inUse;
        this.dirty = dirty;
        this.depreciated = depreciated;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getInUse() {
        return inUse;
    }

    public void setInUse(int inUse) {
        this.inUse = inUse;
    }

    public int getDirty() {
        return dirty;
    }

    public void setDirty(int dirty) {
        this.dirty = dirty;
    }

    public int getDepreciated() {
        return depreciated;
    }

    public void setDepreciated(int depreciated) {
        this.depreciated = depreciated;
    }
}
