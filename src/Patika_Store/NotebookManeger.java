package Patika_Store;

public class NotebookManeger extends ProductManeger{

    public void addProduct() {
        int id;
        double price;
        String name;
        String BrandName;
        Brand b;

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
        NotebookPro.getNoteList().add(new NotebookPro(id,price,name,b));
    }


    public void deleteProduct() {
        int id;
        int i=0;
        int index=-1;
        System.out.print("Silinecek Ürün id girin:");
        id = input.nextInt();

        for (NotebookPro p : NotebookPro.getNoteList()) {
            if (id == p.getId()) {
                index = i;
            }
            i++;
        }

        if (index == -1){
            System.out.println( "Geçersiz index");
        }else {
            System.out.println("Silindi " + NotebookPro.getNoteList().get(index).getName());
            NotebookPro.getNoteList().remove(index);
        }


    }


    public void printList () {
        int i=1;
        for (NotebookPro p : NotebookPro.getNoteList()) {
            System.out.print(i + " - ");
            System.out.print("id: " + p.getId());
            System.out.print(" fiyat: " + p.getPrice());
            System.out.print(" isim: " + p.getName());
            System.out.print(" Marka: " + p.getBrand().getName());
            System.out.println();
            i++;
        }
        System.out.println();
    }
}
