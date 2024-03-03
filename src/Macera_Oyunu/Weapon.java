package Macera_Oyunu;
public class Weapon {
    private String name;
    private int id;
    private int damage;
    private int price;

    public static Weapon[] weap;

    public Weapon(String name, int id, int damage, int price) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.price = price;
    }
    public static Weapon WeaponSelectById( int select){
        Weapon selectedWeapon=null;
        for (Weapon w : weap){
            if (w.getId()==select)
                selectedWeapon=w;
        }
        return selectedWeapon;
    }


     static {
        weap = new Weapon[3];
        weap[0]= new Weapon("Tabanca",1,2,4);
        weap[1]= new Weapon("Kılıç",2,3,35);
        weap[2]= new Weapon("Tüfek",3,7,45);
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
