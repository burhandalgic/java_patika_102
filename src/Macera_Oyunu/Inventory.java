package Macera_Oyunu;
public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private static boolean water=false;
    private static boolean firewood=false;
    private static boolean food=false;

    public Inventory() {
        this.weapon = new Weapon("Yumruk",0,0,0);
        this.armor = new Armor("Zırhsız",0,0,0);
    }

    public static boolean winCheck (){
        return water&&food&&firewood ;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }
}
