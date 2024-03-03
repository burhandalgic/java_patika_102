package Macera_Oyunu;
import java.util.Locale;
import java.util.Random;

public abstract class BattleLoc extends Location{
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String locName, Obstacle obstacle,String award,int maxObstacle) {
        super(player, locName);
        this.obstacle=obstacle;
        this.award=award;
        this.maxObstacle=maxObstacle;
    }
    public BattleLoc(Player player, String locName, Obstacle obstacle,int maxObstacle) {
        super(player, locName);
        this.obstacle=obstacle;
        this.maxObstacle=maxObstacle;
    }



    @Override
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
                System.out.println("Buradaki tüm düşmanları yendiniz ödülünüz: " + this.award );
                switch (getObstacle().getId()){
                    case 1:
                        this.getPlayer().getInventory().setFood(true);
                        break;
                    case 2:
                        this.getPlayer().getInventory().setFirewood(true);
                        break;
                    case 3:
                        this.getPlayer().getInventory().setWater(true);
                        break;
                }
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
                System.out.println("Düşmanı yendiniz ! " + this.getObstacle().getAward() + " ödül kazandınız ");
                this.getPlayer().setMoney(this.getObstacle().getAward()+this.getPlayer().getMoney());
                System.out.println("Güncel paranız : " + this.getPlayer().getMoney());
            }else return false;


        }
        return true;
    }
    public void playerStats(){
        System.out.println("Oyuncu Değerleri");
        System.out.println("------------------------");
        System.out.println("Sağlık " + this.getPlayer().getHealth());
        System.out.println("Hasar " + this.getPlayer().getDamage());
        System.out.println("Para " + this.getPlayer().getMoney());
        System.out.println("Silah " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Zırh" + this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama " + this.getPlayer().getInventory().getArmor().getBlock());
    }

    public void obstacleStats(int i){
        System.out.println(i + ". " + this.obstacle.getName() + " Değerleri ");
        System.out.println("------------------------");
        System.out.println("Hasar " + this.obstacle.getDamage());
        System.out.println("Sağlık " + this.obstacle.getHealth());
        System.out.println("Ödül " + this.obstacle.getAward());

    }

    public void afterHit () {
        System.out.println("Canınız: " + this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName() + "'nin canı : " + this.getObstacle().getHealth());
    }



    public int randomObstcle(){
        Random random = new Random();
        return random.nextInt(this.maxObstacle)+1;
    }

    public boolean randomBoolean(){
        Random random = new Random();
        return random.nextBoolean();
    }


    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }

}
