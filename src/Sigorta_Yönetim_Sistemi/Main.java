package Sigorta_Yönetim_Sistemi;

import Liste_Sınıfı.List;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account ac1 = new IndividualCostumer(new User("Burhan","Dalgıç","burhandalkic@hotmail.com","1234","Mühendis",33));
        Account ac2 = new EnterpriseCostumer(new User("Ayçe","Mekatronik","info@aycemekatronik.com","5678","Mekatronik",10));
        AccountManeger.hesaplar.add(ac1);
        AccountManeger.hesaplar.add(ac2);

        while (true) {


            Account acc = null;
            try {
                acc = AccountManeger.login();
                System.out.println("-------- Hoşgeldiniz -------");
            } catch (Exception e) {
                System.out.println("Tekrar deneyin ! " + e.getMessage());
                continue;
            }
            while (acc.getUser().isAuthenticationStatus()) {

                int select = 0;
                System.out.println("İşlem seçiniz : ");
                System.out.println("0- Çıkış yap ");
                System.out.println("1- Bilgileri göster ");
                System.out.println("2- Adres ekle-çıkar ");
                System.out.println("3- Sigorta ekle ");
                select = input.nextInt();

                switch (select) {
                    case 0:
                        acc.getUser().setAuthenticationStatus(false);
                        break;
                    case 1:
                        acc.showUserInfo();
                        break;
                    case 2 :
                        AddressManager.adddeleteAdress(acc.getUser());
                        break;
                    case 3 :
                        InsuranceManager.adddInsurance(acc.getUser(),acc);
                        break;
                    default:
                        System.out.println("Geçersiz tekrar dene ");
                        break;
                }


            } // while end


        }

    }
}