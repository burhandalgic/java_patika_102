package Kitap_Listesi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>();
        ArrayList<Book> list2 = new ArrayList<Book>();

        list.add(new Book("Sefiller", 520,"Victor Hugo",1862));
        list.add(new Book("Suç ve Ceza", 312,"Fyodor Dostoevsky",1894));
        list.add(new Book("Romeo ve Juliet", 450,"William Shakespeare",1652));
        list.add(new Book("Don Kişot", 80,"Miguel de Cervantes",1852));
        list.add(new Book("Karamazov Kardeşler", 666,"Fyodor Dostoevsky",1752));
        list.add(new Book("Jane Eyre", 550,"Charlotte Bronte",1847));
        list.add(new Book("Madame Bovary", 20,"Gustave Flaubert",1856));
        list.add(new Book("Kırmızı ve Siyah", 480,"Stendhal",1830));
        list.add(new Book("Yeraltından Notlar", 90,"Fyodor Dostoevsky",1864));
        list.add(new Book("Güneşte ve Gölgelerde", 440,"Lev Tolstoy",1877));

        LinkedHashMap<String,String> listmap1 = new LinkedHashMap<>();
        list.stream().forEach(i-> listmap1.put(i.getName(),i.getWriter()));

        System.out.println("map listesi........");
        for  (String x : listmap1.keySet()){
            System.out.print(x + " : ");
            System.out.println(listmap1.get(x));
        }

        list.stream().filter(i-> i.getPageNumber()>100).forEach(i-> list2.add(i));

        System.out.println();
        System.out.println("sayfa sayısı 100 den büyükler............ ");

        list2.stream().forEach(i-> System.out.println(i.getName()));





    }
}