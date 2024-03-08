package Kitap_Sıralayıcı;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {

    public static void main(String[] args) {

        Set<Book> books1 = new TreeSet<>();
        books1.add(new Book("Sefiller", 520,"Victor Hugo",1862));
        books1.add(new Book("Suç ve Ceza", 312,"Fyodor Dostoevsky",1894));
        books1.add(new Book("Don Kişot", 450,"Miguel de Cervantes",1652));

        Set<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNumber()-o2.getPageNumber();
            }
        });



        System.out.println("Kitap ismine göre sıralama");
        for (Book x: books1 ){
            System.out.println(x.getName());
            books2.add(x);
        }
        System.out.println("----------------");
        System.out.println("Kitap sayfa sayısına göre sıralama");
        for (Book x: books2 ){
            System.out.println(x.getName());
        }



    }
}