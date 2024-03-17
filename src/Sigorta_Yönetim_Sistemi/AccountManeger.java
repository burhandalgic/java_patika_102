package Sigorta_Yönetim_Sistemi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManeger {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Account> hesaplar = new ArrayList<>();


    public static Account login () throws Exception {
        String email;
        String pasword;
        System.out.print("E-mail giriniz : ");
        email = scan.next();
        System.out.print("Şifre giriniz : ");
        pasword = scan.next();

        for (Account acc : hesaplar) {

            if( acc.getUser().getEmail().equals(email) && acc.getUser().getPassword().equals(pasword))  {
                acc.getUser().setAuthenticationStatus(true);
                return acc;
            }
        }
        throw new Exception("Geçersiz veya uyumsuz mail-şifre ! ");
    }



}
