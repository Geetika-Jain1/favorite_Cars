package org.example;

public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
//use this constructor when we only have make,model,and year.
    //such as when we create a new car without id(no.)
    public Car( String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
//use when we use all 4 property (including id)
    //such as when we get car from base
    public Car(int id, String make, String model, int year) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
