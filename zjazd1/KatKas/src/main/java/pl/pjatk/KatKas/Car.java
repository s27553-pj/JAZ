package pl.pjatk.KatKas;

public class Car {
    private String model;
    private double age;
    private double price;

    public Car(String model, double age, double price) {
        this.model = model;
        this.age = age;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getAge() {
        return age;
    }

    public double getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
