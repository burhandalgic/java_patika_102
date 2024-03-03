package Macera_Oyunu;
public abstract class GameChar {
    private String charName;
    private int id;
    private int damage;
    private int health;
    private int money;

    public GameChar(String charName, int id, int damage, int health, int money) {
        this.charName = charName;
        this.id = id;
        this.damage = damage;
        this.health = health;
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public int getId() {
        return id;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }
}
