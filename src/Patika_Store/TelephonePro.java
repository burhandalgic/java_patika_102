package Patika_Store;

import java.util.ArrayList;

public class TelephonePro extends Product{
    private int batary;
    private String color;

    private static ArrayList<TelephonePro> telList= new ArrayList<>();

    public TelephonePro(int id, double price, String name, Brand brand, int batary, String color) {
        super(id, price, name, brand);
        this.batary = batary;
        this.color = color;
    }

    public int getBatary() {
        return batary;
    }

    public void setBatary(int batary) {
        this.batary = batary;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static ArrayList<TelephonePro> getTelList() {
        return telList;
    }

    public static void setTelList(ArrayList<TelephonePro> telList) {
        TelephonePro.telList = telList;
    }
}
