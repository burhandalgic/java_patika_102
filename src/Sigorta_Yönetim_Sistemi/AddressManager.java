package Sigorta_Yönetim_Sistemi;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressManager {

   int select;


    public static void adddeleteAdress (User user){
        Scanner scan = new Scanner(System.in);
        int select=0;
        System.out.println("İşlem seçiniz : ");
        System.out.println("0- Çıkış yap ");
        System.out.println("1- Ev adresi ekle ");
        System.out.println("2- İş adresi ekle ");
        System.out.println("3- Adres sil ");
            select = scan.nextInt();

            switch (select) {
                case 0:
                    System.out.println("Çıkış yapıldı  ");
                    break;
                case 1:
                    addhomeAdres(user);
                    break;
                case 2 :
                    addbusinessAdres(user);
                    break;
                case 3 :
                    deleteAdress(user);
                    break;
                default:
                    System.out.println("Geçersiz giriş , çıkış yapıldı  ");
                    break;
            }


        }

    public static void addhomeAdres( User user){
        Scanner scan = new Scanner(System.in);
        String country;
        String city;
        String street;
        int no;

        try {
            System.out.print("Ülke girin : ");
            country=scan.next();
            System.out.print("Şehir girin : ");
            city=scan.next();
            System.out.print("Cadde girin : ");
            street=scan.next();
            System.out.print("No girin : ");
            no=scan.nextInt();


            user.getAddressList().add(new HomeAddress(country,city,street,no));
            System.out.println( "Adres eklendi -------- ");
        }catch (Exception e){
            System.out.println("tanımsız değer çıkış yapıldı :" + e.getMessage() );
        }

    }

    public static void addbusinessAdres( User user){
        Scanner scan = new Scanner(System.in);
        String businesname;
        String country;
        String city;
        String street;
        int no;

        try {
            System.out.print("Firma ismi girin : ");
            businesname=scan.nextLine();
            System.out.print("Ülke girin : ");
            country=scan.nextLine();
            System.out.print("Şehir girin : ");
            city=scan.nextLine();
            System.out.print("Cadde girin : ");
            street=scan.nextLine();
            System.out.print("No girin : ");
            no=scan.nextInt();
            user.getAddressList().add(new BusinessAddress(country,city,street,no,businesname));
            System.out.println( "Adres eklendi -------- ");
        }catch (Exception e){
            System.out.println("tanımsız değer çıkış yapıldı" + e.getMessage());
        }

    }


    public static void deleteAdress (User user){
        Scanner scan = new Scanner(System.in);
        int i=1;
        if (user.getAddressList().size()!=0) {
            for (Address adres : user.getAddressList()) {
                System.out.println(i + ". Adres bilgisi -----------");
                System.out.println("sınıf ismi : " + adres.getClass().getSimpleName());
                if (!adres.getBusinessName().equals("boş")) {
                    System.out.println("Firma ismi : " + adres.getBusinessName() );    }
                System.out.println("Ülke : " + adres.getCountry());
                System.out.println("Şehir : " + adres.getCity());
                System.out.println("Cadde : " + adres.getStreet());
                System.out.println("No : " + adres.getNo());
                i++;
            }
        }else {
            System.out.println("Tanımlı Adres bulunamadı, çıkış yapıldı ! ------------------");
            return;
        }

        System.out.print("Silmek istediğiniz adresin sıra numrasını yazın ----------- : ");
        int select;
        try {
            select=scan.nextInt();
        }catch (Exception e){
            System.out.println("tanımsız değer çıkış yapıldı");
            return;
        }
        if (select<=user.getAddressList().size() && select>0){
             user.getAddressList().remove(select-1);
                System.out.println(select + " numaralı adres silindi ! ----------");
            }else System.out.println("tanımsız giriş , çıkış yapıldı");

        }



    }









