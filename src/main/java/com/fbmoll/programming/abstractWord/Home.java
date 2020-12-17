package com.fbmoll.programming.abstractWord;

public class Home extends Place { // Extends es herencia.
    private LivingPlace livingPlace;

    public LivingPlace getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(LivingPlace livingPlace) {
        this.livingPlace = livingPlace;
    }
}