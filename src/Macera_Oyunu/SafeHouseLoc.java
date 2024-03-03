package Macera_Oyunu;
public class SafeHouseLoc extends NormalLocation{

    public SafeHouseLoc(Player player) {
        super(player, "Güvenli Ev");
    }

   @Override
    public boolean onLocation() {
        if (Inventory.winCheck()){
            Game.win=true;
            return true;
        }else
            System.out.println("Ödül Hedefleri");

       System.out.print("Odun - ");
       if (this.getPlayer().getInventory().isFirewood())
           System.out.println(" KAZANDINIZ");
       else
           System.out.println("EKSİK..........");

       System.out.print("Su - ");
       if (this.getPlayer().getInventory().isWater())
           System.out.println(" KAZANDINIZ");
       else
           System.out.println("EKSİK..........");

       System.out.print("Yemek - ");
       if (this.getPlayer().getInventory().isFood())
           System.out.println(" KAZANDINIZ");
       else
           System.out.println("EKSİK..........");



        getPlayer().setHealth(getPlayer().getOrijinalHealth());
        System.out.println("Güvenli evdesiniz , canınız yenilendi.");
        return true;
   }

}
