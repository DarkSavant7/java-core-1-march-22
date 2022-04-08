package ru.gb.java_core1.l7_oop;

public class Fighter {
    private String name;
    private int health;
    private int damage;

    public Fighter(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void hit(Fighter another) {
        int dmg = (int) (Math.random() * damage / 2 + damage / 2);
        another.health -= dmg;
        System.out.printf("%s hits %s with damage %d, %s health left %d\n",
                this.name,
                another.name,
                dmg,
                another.name,
                another.health);
    }

    public boolean isAlive() {
        return health > 0;
    }
}
