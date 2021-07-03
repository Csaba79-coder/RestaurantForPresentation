package order;

import utils.Scanner;

public class Order {

    private int tableNumber;
    private String orderName;
    private int quantity;
    private boolean isFood;

    private String waiter;

    public Order() {
    }

    /**
     * waiter is not a param! can be changed at every order (all the waiters using their own code when guest's orders!)
     * TODO! getter and setter is needed for waiter
     * @param tableNumber has setter because if the table is outside and starts raining maybe guests change place!
     */

    public Order(int tableNumber, String orderName, int quantity, boolean isFood) {
        this.tableNumber = tableNumber;
        this.orderName = orderName;
        this.quantity = quantity;
        this.isFood = isFood;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isFood() {
        return isFood;
    }

    public void setFood(boolean food) {
        isFood = food;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

}
