package Sigorta_Yönetim_Sistemi;

import java.time.LocalDate;
import java.util.Date;

public class ResidenceInsurance extends Insurance{


    public ResidenceInsurance(String name, double price, LocalDate startDate, LocalDate finishDate, double extraDiscount) {
        super(name, price, startDate, finishDate, extraDiscount);
    }

    @Override
    public double calculate(double x,double extraDiscount) {
        return x*0.03*extraDiscount;
    }
}
