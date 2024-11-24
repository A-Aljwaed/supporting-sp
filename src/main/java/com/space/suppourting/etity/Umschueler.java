package com.space.suppourting.etity;


import com.space.suppourting.services.impls.HireAble;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "umschuller")
public class Umschueler extends Member implements HireAble {


    @Column(name = "fehltage")
    private static int fallDays;
    @Column(name = "UmschulungsAnbieter")
    private String courseMaker;

    public static int getFallDays() {
        return fallDays;
    }

    public static void setFallDays(int fallDays) {
        Umschueler.fallDays = fallDays;
    }



    @Override
    public boolean control_hire(int fallDays) {
        this.fallDays = fallDays;

        if (fallDays <= 10){
            return true;
        }

        else return false;
    }

    public String getCourseMaker() {
        return courseMaker;
    }

    public void setCourseMaker(String courseMaker) {
        this.courseMaker = courseMaker;
    }
}
