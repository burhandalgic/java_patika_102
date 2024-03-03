package Macera_Oyunu;
import java.util.Random;

public class Mine extends BattleLoc{
    public Mine(Player player) {
        super(player, "Maden", new Snake(),5);
    }

    public boolean onLocation() {

        int obsNumber=randomObstcle();
        System.out.println("Şuan buradasınız : " + this.getName());
        System.out.println("Dikkatli ol burada " + obsNumber + " adet " + this.getObstacle().getName() + " yaşıyor!");
        System.out.println("<S>avaş veya <K>aç ! ");
        String selectCase = input.nextLine();
        selectCase=selectCase.toUpperCase();
        if (selectCase.equals("S")){
            System.out.println("SAVAŞ BAŞLADI.........");
            if (combat(obsNumber)) {
                return true;
            }
            if (this.getPlayer().getHealth()<=0) {
                System.out.println("Öldünüz");
                return false;
            }
        }
        return true;
    }
    public boolean combat (int onsNumber){
        for (int i=1;i<=onsNumber;i++){
            this.getObstacle().setHealth(this.getObstacle().getOrijinalHealth());
            this.getObstacle().setDamage(randomHealth());
            playerStats();
            obstacleStats(i);
            while (this.getObstacle().getHealth()>0 && this.getPlayer().getHealth()>0){
                System.out.print("<V>ur veya <K>aç : ");
                String selectCase = input.nextLine().toUpperCase();
                if (selectCase.equals("V")){
                    boolean select = randomBoolean();
                    if (randomBoolean()) {
                        // player > canavar
                        System.out.println("Siz vurdunuz ! ");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();
                        // canavar > player
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println(this.getObstacle().getName() + " size vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) obstacleDamage = 0;
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }

                    }else {
                        // canavar > player
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println(this.getObstacle().getName() + " size vurdu !");
                            int obstacleDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obstacleDamage < 0) obstacleDamage = 0;
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obstacleDamage);
                            afterHit();
                        }
                        // player > canavar
                        System.out.println("Siz vurdunuz ! ");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotalDamage());
                        afterHit();

                    }




                }
                else {
                    return false;
                }
            }

            if (this.getPlayer().getHealth()>this.getObstacle().getHealth()){
                System.out.println("Yılanı yendiniz ! ");
                int ran=ranHundred();
                if (ran<45){
                    System.out.println("Hiçbirşey Kazanamadınız :(");
                }



                if (ran<70 && ran>=45){
                    int money=winMoney();
                    System.out.println(money + " birim -------Para kazandınız----------");
                    this.getPlayer().setMoney(money+this.getPlayer().getMoney());
                    System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
                }






                if (ran<85 && ran>=70){
                    System.out.println(" -------Silah kazandınız----------");
                    buyWeapon();
                    System.out.println("Güncel Silahınız : " + this.getPlayer().getInventory().getWeapon().getName());
                }
                if (ran<100 && ran>=85){
                    System.out.println(" -------Zırh kazandınız----------");
                    buyArmor();
                    System.out.println("Güncel Zırhınız : " + this.getPlayer().getInventory().getArmor().getName());
                }

            }else return false;


        }
        return true;
    }

    public int randomHealth(){
        Random random=new Random();
        return random.nextInt(4)+3;
    }

    public int ranHundred(){
        Random random=new Random();
        return random.nextInt(99);
    }

    public int winMoney(){
        int ran;
        Random random=new Random();
        ran=random.nextInt(99);
        if (ran<50) return 1;
        if (ran<80 && ran>=50)return 5;
        if (ran<100 && ran>=80) return 10;
        return 0;
    }

    public void buyWeapon(){
        int ran;
        Random random=new Random();
        ran=random.nextInt(99);
        if (ran<50) this.getPlayer().getInventory().setWeapon(Weapon.weap[2]);
        if (ran<80 && ran>=50) this.getPlayer().getInventory().setWeapon(Weapon.weap[1]);
        if (ran<100 && ran>=80) this.getPlayer().getInventory().setWeapon(Weapon.weap[0]);

    }

    public void buyArmor(){
        int ran;
        Random random=new Random();
        ran=random.nextInt(99);
        if (ran<50) this.getPlayer().getInventory().setArmor(Armor.arm[2]);
        if (ran<80 && ran>=50) this.getPlayer().getInventory().setArmor(Armor.arm[1]);
        if (ran<100 && ran>=80) this.getPlayer().getInventory().setArmor(Armor.arm[0]);

    }



}



