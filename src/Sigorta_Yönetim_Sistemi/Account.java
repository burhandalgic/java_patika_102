package Sigorta_Yönetim_Sistemi;

import java.util.ArrayList;

public abstract class Account {
    private User user;

    public Account(User user) {
        this.user = user;
    }

    public final void showUserInfo(){
        System.out.println("--------------Müşteri Bilgileri-------------");
        System.out.println("sınıf ismi :" + user.getClass().getSimpleName());
        System.out.println("İsmi : "+ user.getName());
        System.out.println("Soyisim : " + user.getLastName());
        System.out.println("Email : " + user.getEmail());
        System.out.println("Parola : " + user.getPassword());
        System.out.println("Meslek : " + user.getJob());
        System.out.println("Yaş : " + user.getAge());
        System.out.println("Son giriş tarihi : " + user.getLastEnterDate());
        int i=1;
        if (user.getAddressList().size()!=0) {
            for (Address adres : user.getAddressList()) {
                System.out.println(i + ". Adres bilgisi -----------");
                System.out.println("sınıf ismi : " + adres.getClass().getSimpleName());
                if (!adres.getBusinessName().equals("boş")) {
                    System.out.println("Firma ismi : " + adres.getBusinessName() );    }
                System.out.println("Ülke : " + adres.getCountry());
                System.out.println("Şehir : " + adres.getCity());
                System.out.println("Cadde : " + adres.getStreet());
                System.out.println("No : " + adres.getNo());
                i++;
            }
        }else System.out.println("Tanımlı Adres bulunamadı ! ------------------");
        i=1;
        if (user.getInsuranceList().size()!=0) {
            for (Insurance sigorta : user.getInsuranceList()) {
                System.out.println(i + ". Sigorta bilgisi --------------");
                System.out.println("sınıf ismi : " + sigorta.getClass().getSimpleName());
                System.out.println("Sigorta ismi : " + sigorta.getName());
                System.out.println("Teminat fiyatı : " + sigorta.getPrice());
                System.out.println("Sigorta ücreti : " + sigorta.getInsurancePrice());
                System.out.println("Başlangıç tarihi : " + sigorta.getStartDate());
                System.out.println("Bitiş tarihi : " + sigorta.getFinishDate());
                i++;
            }
        }else System.out.println("Tanımlı sigorta bulunamadı ! -----------------");

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
