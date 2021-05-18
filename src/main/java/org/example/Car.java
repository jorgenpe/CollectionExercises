package org.example;

public class Car {

    private int Id;
    private String brand;
    private String Model;

    Car(int Id, String brand, String model){
        this.Id = Id;
        this.brand = brand;
        this.Model = model;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }
}
