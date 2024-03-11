package Patika_Store;

import java.lang.invoke.SwitchPoint;
import java.util.*;

public class Main {

    public static void printBrand(){

        for (Brand b : Brand.getBrand() )
            System.out.println(b.getName());

    }

    public static void main(String[] args) {
        boolean exit = true;
        Scanner scan = new Scanner(System.in);
        ProductManeger tm=new TelephoneManeger();
        ProductManeger nm=new NotebookManeger();
        while (exit) {
            System.out.println(" PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            int select = scan.nextInt();

            switch (select){
                case 0:
                    exit=false;
                    break;
                case 1:
                    nm.run();
                    break;
                case 2:
                    tm.run();
                    break;
                case 3:
                    printBrand();
                    break;
                default:
                    System.out.println("Geçersiz giriş tekrar dene!");
                    break;
            }



        }


    }
    }