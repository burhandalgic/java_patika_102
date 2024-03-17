package Sigorta_Yönetim_Sistemi;

import java.time.LocalDate;
import java.util.Date;

public abstract class Insurance {
    private String name;
    private double price;
    private double insurancePrice;
    private LocalDate startDate;
    private LocalDate finishDate;

    public Insurance(String name, double price, LocalDate startDate, LocalDate finishDate,double extraDiscount) {
        this.name = name;
        this.price = price;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.insurancePrice=calculate(price,extraDiscount);
    }

    public abstract double calculate(double x,double extraDiscount);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(LocalDate finishDate) {
        this.finishDate = finishDate;
    }

    public double getInsurancePrice() {
        return insurancePrice;
    }

    public void setInsurancePrice(double insurancePrice) {
        this.insurancePrice = insurancePrice;
    }
}
