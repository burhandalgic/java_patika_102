package Macera_Oyunu;
public class StoreLoc extends NormalLocation{
    public StoreLoc(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        boolean exit=true;
        while (exit) {
            System.out.println(" Mağazaya hoşgeldiniz ");
            System.out.println(" 1- Silahlar ");
            System.out.println(" 2- Zırhlar ");
            System.out.println(" 3- Çıkış yap ");
            System.out.print(" Seçiminiz : ");
            int selectCase = input.nextInt();
            while (selectCase < 0 || selectCase > 3) {
                System.out.println(" Geçersiz sayı tekrar deneyiniz ! ");
                selectCase = input.nextInt();
            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    break;
                case 2:
                    printArmor();
                    break;
                case 3:
                    System.out.println(" Çıkış yapıldı ");
                    exit=false;
            }
        }
        return true;
    }
    public void printWeapon(){
        System.out.println(" ------Silahlar----- ");
        for (Weapon w : Weapon.weap){
            System.out.println(w.getId() + " - " +  w.getName() + " - Hasar : " + w.getDamage() + " Para : " + w.getPrice());
        }
        System.out.println("0 - Çıkış");
        System.out.println(" Silah seçiniz : ");
        int selectWeapon = input.nextInt();
        while(selectWeapon<0 || selectWeapon>Weapon.weap.length){
            System.out.println(" Geçersiz sayı tekrar deneyiniz ! ");
            selectWeapon = input.nextInt();
        }
        if (selectWeapon==0) {
            return;
        }
        Weapon selectedWeapon = Weapon.WeaponSelectById(selectWeapon);
        if (selectedWeapon!=null){
            if (selectedWeapon.getPrice()>this.getPlayer().getMoney()){
                System.out.println("Bakiyeniz yetersiz !");
            }else{
                System.out.println(selectedWeapon.getName() + " silahını satın aldınız");
                int balance = this.getPlayer().getMoney()-selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız : " + this.getPlayer().getMoney() );
                 this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }
    public void printArmor(){
        System.out.println(" ------Zırhlar----- ");
        for (Armor a : Armor.arm){
            System.out.println(a.getId() + " - " +  a.getName() + " - Blok : " + a.getBlock() + " Para : " + a.getPrice());
        }
        System.out.println("0 - Çıkış");
        System.out.println(" Zırh seçiniz : ");
        int selectArm = input.nextInt();
        while(selectArm<0 || selectArm> Armor.arm.length){
            System.out.println(" Geçersiz sayı tekrar deneyiniz ! ");
            selectArm = input.nextInt();
        }
        if (selectArm==0) {
            return;
        }
        Armor SelectedArmor = Armor.ArmorSelectById(selectArm);
        if (SelectedArmor!=null){
            if (SelectedArmor.getPrice()>this.getPlayer().getMoney()){
                System.out.println("Bakiyeniz yetersiz !");
            }else{
                System.out.println(SelectedArmor.getName() + " Zırhını satın aldınız");
                int balance = this.getPlayer().getMoney()-SelectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan paranız : " + this.getPlayer().getMoney() );
                this.getPlayer().getInventory().setArmor(SelectedArmor);
            }
        }



    }

}
