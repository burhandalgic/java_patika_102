package Patika_Store;

import java.util.Scanner;

public abstract class ProductManeger {
    static Scanner input = new Scanner(System.in);
    public void run() {

        System.out.println(" -------- İşlemler ----------");
        System.out.println("1 - Ürün ekle");
        System.out.println("2 - Ürün Sil ");
        System.out.println("3 - Ürünleri listele");
        System.out.println("0 - Çıkış Yap");
        int select = input.nextInt();
        boolean exit = true;

        switch (select) {
            case 0:
                exit = false;
                break;
            case 1:
                addProduct();
                break;
            case 2:
                deleteProduct();
                break;
            case 3:
                printList();
                break;
            default:
                System.out.println("Geçersiz giriş tekrar dene!");
                break;
        }
    }

    public abstract void addProduct();
    public abstract void deleteProduct();
    public abstract void printList ();



}
