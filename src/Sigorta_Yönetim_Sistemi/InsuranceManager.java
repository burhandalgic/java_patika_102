package Sigorta_Yönetim_Sistemi;

import java.time.LocalDate;
import java.util.Scanner;

public class InsuranceManager {

    public static void adddInsurance (User user,Account acc){
        double extraDiscount=1;
        if (acc.getClass().getSimpleName().equals("IndividualCostumer")){
            System.out.println("Bireysel kullanıcı indirimi yapıldı  : %20");
            extraDiscount=0.8;

        }
        if (acc.getClass().getSimpleName().equals("EnterpriseCostumer")){
            System.out.println("Kurumsal kullanıcı indirimi yapıldı  : %10");
            extraDiscount=0.9;

        }

        Scanner scan = new Scanner(System.in);
        int select=0;
        System.out.println("İşlem seçiniz : ");
        System.out.println("0- Çıkış yap ");
        System.out.println("1- Hayat Sigortası ekle ");
        System.out.println("2- Araç Sigortası ekle ");
        System.out.println("3- Konut Sigortası ekle ");
        System.out.println("4- Seyahat Sigortası ekle ");
        select = scan.nextInt();
        double price;

        switch (select) {
            case 0:
                System.out.println("Çıkış yapıldı  ");
                break;
            case 1:
                System.out.println("Sigorta miktarını girin");
                price=scan.nextDouble();
                user.getInsuranceList().add(new HealthInsurance("Hayat sigortası",price, LocalDate.of(2024,03,17), LocalDate.of(2025,03,17),extraDiscount));
                System.out.println("Sigorta eklendi");
                break;
            case 2 :
                System.out.println("Sigorta miktarını girin");
                price=scan.nextDouble();
                user.getInsuranceList().add(new CarInsurance("Araç sigortası",price, LocalDate.of(2024,03,17), LocalDate.of(2025,03,17),extraDiscount));
                System.out.println("Sigorta eklendi");
                break;
            case 3 :
                System.out.println("Sigorta miktarını girin");
                price=scan.nextDouble();
                user.getInsuranceList().add(new ResidenceInsurance ("Konut sigortası",price, LocalDate.of(2024,03,17), LocalDate.of(2025,03,17),extraDiscount));
                System.out.println("Sigorta eklendi");
                break;
            case 4 :
                System.out.println("Sigorta miktarını girin");
                price=scan.nextDouble();
                user.getInsuranceList().add(new TravelInsurance("Seyahat sigortası",price, LocalDate.of(2024,03,17), LocalDate.of(2025,03,17),extraDiscount));
                System.out.println("Sigorta eklendi");
                break;
            default:
                System.out.println("Geçersiz giriş , çıkış yapıldı  ");
                break;
        }
    }
}
