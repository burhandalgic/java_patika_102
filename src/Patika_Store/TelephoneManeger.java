package Patika_Store;

public class TelephoneManeger extends ProductManeger{


    public void addProduct() {
        int id;
        double price;
        String name;
        String BrandName;
        Brand b;
        int batary;
        String color;

        System.out.print("Ürün id girin:");
        id = input.nextInt();

        System.out.print("Fiyat girin:");
        price = input.nextDouble();

        System.out.print("Ürün ismi girin:");
        name = input.next();

        System.out.print("Marka ismi girin:");
        BrandName = input.next();

        b = Brand.getBrand().get(9);

        for (Brand bra : Brand.getBrand()) {
            if (BrandName.equals(bra.getName()))
                b = bra;
        }

        System.out.print("Batarya girin:");
        batary = input.nextInt();

        System.out.print("Renk girin:");
        color = input.next();


        TelephonePro.getTelList().add( new TelephonePro(id,price,name,b,batary,color));
    }


    public void deleteProduct() {
        int id;
        int i=0;
        int index=-1;
        System.out.print("Silinecek Ürün id girin:");
        id = input.nextInt();

        for (TelephonePro p : TelephonePro.getTelList()) {
            if (id == p.getId()) {
                index = i;
            }
            i++;
        }

        if (index == -1){
            System.out.println( "Geçersiz index");
        }else {
            System.out.println("Silindi " + TelephonePro.getTelList().get(index).getName());
            TelephonePro.getTelList().remove(index);
        }


    }


    public void printList () {
        int i=1;
        for (TelephonePro p : TelephonePro.getTelList()) {
            System.out.print(i + " - ");
            System.out.print("id: " + p.getId());
            System.out.print(" fiyat: " + p.getPrice());
            System.out.print(" isim: " + p.getName());
            System.out.print(" Marka: " + p.getBrand().getName());
            System.out.print(" Batarya: " + p.getBatary());
            System.out.print(" Renk: " + p.getColor());
            System.out.println();
            i++;
        }
        System.out.println();
    }

}
