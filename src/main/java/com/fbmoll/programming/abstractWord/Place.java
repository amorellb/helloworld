package com.fbmoll.programming.abstractWord;

public abstract class Place { // No puedes crear variables de una clase abstracta
    private Integer sqrtMeters;
    private Double price;
    private String location;
    private String temperature;

    public Integer getSqrtMeters() {
        return sqrtMeters;
    }

    public void setSqrtMeters(Integer sqrtMeters) {
        this.sqrtMeters = sqrtMeters;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
