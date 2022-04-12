package ru.gb.java_core1.l7_oop;

public class Bowl {
    private int foodAmount;

    public void putFood(int amount) {
        this.foodAmount += amount;
        System.out.printf("Food increased by %d pts, there is now %d\n", amount, foodAmount);
    }

    public boolean decreaseFood(int amount) {
        if (amount > this.foodAmount) {
            return false;
        }
        this.foodAmount -= amount;
        return true;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "Bowl{" +
                "foodAmount=" + foodAmount +
                '}';
    }
}
