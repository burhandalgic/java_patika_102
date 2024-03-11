package Patika_Store;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Brand  {
    private int id ;
    private String name;

    private static ArrayList<Brand> brand = new ArrayList<>();

    static {

        brand.add(new Brand(1,"Samsung"));
        brand.add(new Brand(2,"Lenovo"));
        brand.add(new Brand(3,"Apple"));
        brand.add(new Brand(4,"Huawei"));
        brand.add(new Brand(5,"Casper"));
        brand.add(new Brand(6,"Asus"));
        brand.add(new Brand(7,"HP"));
        brand.add(new Brand(8,"Xiaomi"));
        brand.add(new Brand(9,"Monster"));
        brand.add(new Brand(0,"xxxxtanımsız"));
        Collections.sort(brand,Comparator.comparing(Brand::getName));

    }

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Brand() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static ArrayList<Brand> getBrand() {
        return brand;
    }

    public static void setBrand(ArrayList<Brand> brand) {
        Brand.brand = brand;
    }


}
