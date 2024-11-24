package com.space.suppourting.etity;

import com.space.suppourting.services.impls.HireAble;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Azubi")
public class Azubi extends Member implements HireAble {


    @Column(name = "fehltage")
    private static int fallDays;
    @Column(name = "Betrieb")
    private String company;

    public static int getFallDays() {
        return fallDays;
    }

    public static void setFallDays(int fallDays) {
        Azubi.fallDays = fallDays;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean control_hire(int fallDays) {
        this.fallDays = fallDays;

        if (fallDays <= 30){
            return true;
        }

        else return false;
    }
}
