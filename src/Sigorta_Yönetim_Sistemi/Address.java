package Sigorta_Yönetim_Sistemi;

public abstract class Address {
    private String country;
    private String city;
    private String street;
    private int no;
    private String businessName;

    public Address(String country, String city, String street, int no , String businessName) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.no = no;
        this.businessName=businessName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }


}
