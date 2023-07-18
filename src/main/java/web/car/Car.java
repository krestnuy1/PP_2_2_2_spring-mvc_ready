package web.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;

    private String series;

    private int yearOfManufacturing;

    private List<Car> carList;

    public Car(){

    }

    public Car(String model, String series, int yearOfManufacturing) {
        this.model = model;
        this.series = series;
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(int yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public List<Car> getCarList() {
        carList = new ArrayList<>();
        carList.add(new Car("Tesla", "Model 3", 2018));
        carList.add(new Car("Toyota", "Mark II", 1998));
        carList.add(new Car("Lexus", "RX 350", 2023));
        carList.add(new Car("Honda", "Accord", 2006));
        carList.add(new Car("Ford", "Explorer", 2010));
        return carList;
    }
}
