package Macera_Oyunu;
import java.util.Scanner;

public class Player {
    private Inventory inventory;
    private String name;
    private String charName;
    private int id;
    private int damage;
    private int health;
    private int money;
    private int orijinalHealth;


    public Player(String name) {

        this.name = name;
        this.inventory = new Inventory();
    }


    public void selectChar(){
        GameChar[] gameCharList = {new Samurai(),new Archer(),new Knight()};
        System.out.println("----------------------");
        for ( GameChar x :gameCharList){
            System.out.println( "*  " + x.getId()+ "\t" + x.getCharName() +"\t" + "Hasar :" + x.getDamage() +"\t" + "Sağlık :" +x.getHealth() +"\t" + "Para :" +x.getMoney());
        }
        System.out.println("Bir karakter seçiniz: ");
        System.out.println("---------------------");
        Scanner scan = new Scanner(System.in);
        int select = scan.nextInt();
        switch (select){
            case 1:
                initPlayer(gameCharList[0]);
                break;
            case 2:
                initPlayer(gameCharList[1]);
                break;
            case 3:
                initPlayer(gameCharList[2]);
                break;
            default:
                initPlayer(gameCharList[0]);
                break;
        }

        System.out.println("Seçili karakter : ");
        System.out.println("İsim          : " + this.name);
        System.out.println("Karakter Adı  : " + this.charName);
        System.out.println("Karakter Id   : " + this.id);
        System.out.println("Hasar         : " + this.damage);
        System.out.println("Sağlık        : " + this.health);
        System.out.println("Para          : " + this.money);



    }

    public void printInfo(){
        System.out.println("--------------------------------");
        System.out.print("Silahınız:" + this.getInventory().getWeapon().getName());
        System.out.print(" Zırhınız:" + this.getInventory().getArmor().getName());
        System.out.print(" Bloklama:" + this.getInventory().getArmor().getBlock());
        System.out.print(" Hasar:" + this.getTotalDamage());
        System.out.print(" Sağlık:" + this.getHealth());
        System.out.println(" Para:" + this.getMoney());
    }

    public void initPlayer (GameChar x) {
        this.damage=x.getDamage();
        this.charName=x.getCharName();
        this.id=x.getId();
        this.health=x.getHealth();
        this.money=x.getMoney();
        this.orijinalHealth=x.getHealth();

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalDamage() {
        return damage + inventory.getWeapon().getDamage();
    }



    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }
}
