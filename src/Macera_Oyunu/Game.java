package Macera_Oyunu;
import java.util.Scanner;

public class Game {

    public static boolean win=false;


    public void start() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Macera oyununa hoş geldiniz..... ");
        System.out.print("İsminizi giriniz : ");
        String PlayerName=scan.nextLine();
        Player player = new Player(PlayerName);
        System.out.println("Sayın " + player.getName() + " Hoşgeldiniz....!");
        player.selectChar();

        Location location=null;
        boolean wrongValue=false;

        while (true){
            if(win){
                System.out.println("KAZANDINIZ !");
                break;
            }


            wrongValue=false;
            player.printInfo();
            System.out.println("***********Bölgeler***********");
            System.out.println("1- Güvenli ev ");
            System.out.println("2- Dükkan ");
            System.out.println("3- Mağara, ödül(yemek), dikkatli ol zombi çıkabilir");
            System.out.println("4- Orman, ödül(odun), dikkatli ol vampir çıkabilir");
            System.out.println("5- Nehir, ödül(su), dikkatli ol ayı çıkabilir");
            System.out.println("6- Nehir, ödül(para,silah,zırh), dikkatli ol yılan çıkabilir");
            System.out.println("0- Çıkış Yap ");
            System.out.print("Gitmek istediğiniz bölgeyi seçin : ");
            int selectLoc=scan.nextInt();

            switch (selectLoc){
                case 0:
                    location = null;
                    break;
                case 1:
                    location = new SafeHouseLoc(player);
                    break;
                case 2:
                    location = new StoreLoc(player);
                    break;
                 case 3:
                     if (player.getInventory().isFood()){
                         wrongValue=true;
                         System.out.println("KAZANILMIŞ BÖLGE SEÇTİNİZ ! ");
                         break;
                     }
                    location = new Cave(player);
                    break;
                case 4:
                    if (player.getInventory().isFirewood()){
                        wrongValue=true;
                        System.out.println("KAZANILMIŞ BÖLGE SEÇTİNİZ ! ");
                        break;
                    }
                    location = new Forest(player);
                    break;
                case 5:
                    if (player.getInventory().isWater()){
                        wrongValue=true;
                        System.out.println("KAZANILMIŞ BÖLGE SEÇTİNİZ ! ");
                        break;
                    }
                    location = new River(player);
                    break;
                case 6:
                    location = new Mine(player);
                    break;
                default:
                    System.out.println("Lütfen geçerli bir değer girin ");
                    wrongValue=true;
                    break;
            }
            if (location==null){
                System.out.println("Çıkış yapıldı");
                break;
            }
            if (wrongValue==false) {
                if (location.onLocation() == false) {
                    System.out.println("GAME OVER !");
                    break;
                }
            }
        }
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }
}
